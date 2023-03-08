# API基础第七天：

## 回顾：

1. IO：可以让我们用标准的读写操作来完成对不同设备的读写数据工作。java将IO按照方向划分为输入和输出，参照点是我们写的程序。

   - 输入：用来读取数据的，是从外界到程序的方向，用于获取数据
   - 输出：用来写出数据的，是从程序到外界的方向，用于发送数据

2. Java将IO比喻为"流"，就像生活中的"水流"、"电流"一样，它是以同一个方向顺序流动的过程，只不过这里流动的是字节(2进制数据)，所以在IO中有输入流和输出流之分，我们理解他们是连接程序与另一端的"管道"。用于获取或发送数据到另一端。

3. Java定义了两个超类(抽象类)：

   - java.io.InputStream：所有字节输入流的超类，其中定义了读取数据的方法，因此将来不管读取的是什么设备（连接该设备的流），都有这些读取的方法，因此我们可以使用相同的方法读取不同设备的数据。
   - java.io.OutputStream：所有字节输出流的超类，其中定义了写出数据的方法。

4. 文件流：用于流写文件数据的流，用于连接程序与文件(硬盘)的"管道"，负责读写文件数据。

   - java.io.FileOutputStream：文件输出流
   - java.io.FileInputStream：文件输入流

5. 单字节写：

6. 单字节读：

7. 单字节文件复制：慢

8. 块读写的文件复制：快

9. 写文本数据：

10. 读文本数据：

    

## 精华笔记：

1. java将流分为节点流和处理流两类：

   - 节点流：也称为低级流，是真实连接程序和另一端的"管道"，负责实际读写数据的流，读写一定是建立在节点流的基础之上进行的。节点流好比家里的"自来水管"，连接我们的家庭与自来水厂，负责搬运水。就一对：文件流

   - 处理流：也称为高级流，不能独立存在，必须连接在其他流上，目的是当数据经过当前流时对其进行某种加工处理，简化我们对数据的同等操作。高级流好比家里常见的对水做加工的设备，比如"净水器"、"热水器"，有了它们我们就不必再自己对水进行加工了。好多对。

     > 实际开发中我们经常会串联一组高级流最终连接到低级流上，在读写操作时以流水线式的加工来完成复杂IO操作，这个过程称为"流的连接"

2. 缓冲流：是一对高级流，作用是提高读写数据的效率。

   - 缓冲流内部有一个字节数组,默认长度是8K.缓冲流读写数据时一定是将数据的读写方式转换为块读写来保证读写效率.
   - 通过缓冲流写出的数据会被临时存入缓冲流内部的字节数组,直到数组存满数据才会真实写出一次

3. 对象流：是一对高级流，在流连接中的作用是进行对象的序列化与反序列化。

   - 对象序列化:将一个java对象按照其结构转换为一组字节的过程

     > 注意：
     >
     > 1. 需要进行序列化的类必须实现接口:java.io.Serializable
     >
     > 2. transient关键字可以修饰属性，用于在进行对象序列化时忽略不必要的属性，达到对象瘦身的目的

   - 对象反序列化:将一组字节还原为java对象(前提是这组字节是一个对象序列化得到的字节)

4. IO将流按照读写单位划分为字节流和字符流：

   - 字节流的超类: InputStream和OutputStream，以字节为单位读写数据的流

   - 字符流的超类：Reader和Writer，以字符为单位读写数据的流

     > 注意：
     >
     > 1. 这两组超类是平级关系，互相不存在继承关系
     > 2. 字节流分低级流也有高级流，文件流为低级流，缓冲流和对象流为高级流
     > 3. 字符流都是高级流
     > 4. 字符流最小读写单位为字符(char),但是底层实际还是读写字节,只是字符与字节的转换工作由字符流完成.

5. 常用的字节流有三种：

   - 文件流：是一组低级流(见昨天的笔记)
   - 缓冲流：是一组高级流(见上)
   - 对象流：是一组高级流(见上)

6. 常用的字符流有两种：

   - 转换流：是一组高级流
   - ...........-----明天讲：

7. 转换流：是一对高级流，它们是字符流非常常用的一对实现类同时也是一对高级流,实际开发中我们不直接操作它们,但是它们在流连接中是非常重要的一环.

   - 转换流在在流连接中的意义:由于其它字符流在流连接中要求只能连接在其它字符流上，而不能直接连接在字节流上，原因:字符流是以字符为单位读写，而字节流是以字节为单位读写，读写单位不同，因此不能直接串联在一起工作。转换流是一对字符流，并且是唯一可以直接连接在字节流上的字符流。因此其它字符流都只能连接在转换流上，而转换再连接在字节流上，实现串联起写读写

   

## 笔记：

1. java将流分为节点流和处理流两类：

   - 节点流：也称为低级流，是真实连接程序和另一端的"管道"，负责实际读写数据的流，读写一定是建立在节点流的基础之上进行的。节点流好比家里的"自来水管"，连接我们的家庭与自来水厂，负责搬运水。就一对：文件流

   - 处理流：也称为高级流，不能独立存在，必须连接在其他流上，目的是当数据经过当前流时对其进行某种加工处理，简化我们对数据的同等操作。高级流好比家里常见的对水做加工的设备，比如"净水器"、"热水器"，有了它们我们就不必再自己对水进行加工了。好多对。

     > 实际开发中我们经常会串联一组高级流最终连接到低级流上，在读写操作时以流水线式的加工来完成复杂IO操作，这个过程称为"流的连接"

2. 缓冲流：是一对高级流，作用是提高读写数据的效率。

   - 缓冲流内部有一个字节数组,默认长度是8K.缓冲流读写数据时一定是将数据的读写方式转换为块读写来保证读写效率.

   - 通过缓冲流写出的数据会被临时存入缓冲流内部的字节数组,直到数组存满数据才会真实写出一次

     ```java
     package io;
     
     import java.io.*;
     
     /**
      * 缓冲流:是一对高级流，作用是加快读写效率
      * 1)BufferedInputStream:缓冲输入流
      * 2)BufferedOutputStream:缓冲输出流
      * 缓冲流读写效率快的原因:
      * 1)缓冲流内部有一个8KB的字节数组,
      *   你看着是一个字节一字节的读写，但缓冲流底层已经把它转换为块读写了
      * 缓冲流何时用才有意义:
      * 1)不同的高级流有不同的功能，但只有缓冲流才具有加速功能(块读写)，
      *   其它的高级流不具备加速功能，都是单字节读写，
      *   此时若又想先完成功能再加速处理，则需要流连接，将功能流连到缓冲流上
      */
     public class CopyDemo3Buffered {
         public static void main(String[] args) throws IOException {
             FileInputStream fis = new FileInputStream("wkj.jpg");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("wkj_cp2.jpg");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             long start = System.currentTimeMillis();
             int d;
             while((d=bis.read())!=-1){ //使用缓冲流读取字节
                 bos.write(d); //使用缓冲流写出字节
             }
             long end = System.currentTimeMillis();
             System.out.println("复制完毕!耗时:"+(end-start)+"ms");
             bis.close(); //只需关高级流，因为高级流中先关了低级流
             bos.close();
         }
     }
     ```

3. 对象流：是一对高级流，在流连接中的作用是进行对象的序列化与反序列化。

   - 对象序列化:将一个java对象按照其结构转换为一组字节的过程

     > 注意：
     >
     > 1. 需要进行序列化的类必须实现接口:java.io.Serializable
     >
     > 2. transient关键字可以修饰属性，用于在进行对象序列化时忽略不必要的属性，达到对象瘦身的目的

     ```java
     package io;
     
     import java.io.Serializable;
     import java.util.Arrays;
     
     /**
      * 学生类
      */
     public class Student implements Serializable {
         //私有属性、公开构造、公开getter/setter、重写toString()
         private String name;
         private int age;
         private String gender;
         /*
           当一个属性被关键字transient修饰后，当这个对象进行序列化时，此属性值会被忽略
           忽略不必要的属性值可以达到对象序列化瘦身的目的，
           可以减少磁盘开销或提高网络传输效率
          */
         private transient String[] otherInfo;
     
         public Student() {
         }
     
         public Student(String name, int age, String gender, String[] otherInfo) {
             this.name = name;
             this.age = age;
             this.gender = gender;
             this.otherInfo = otherInfo;
         }
     
         public String getName() {
             return name;
         }
     
         public void setName(String name) {
             this.name = name;
         }
     
         public int getAge() {
             return age;
         }
     
         public void setAge(int age) {
             this.age = age;
         }
     
         public String getGender() {
             return gender;
         }
     
         public void setGender(String gender) {
             this.gender = gender;
         }
     
         public String[] getOtherInfo() {
             return otherInfo;
         }
     
         public void setOtherInfo(String[] otherInfo) {
             this.otherInfo = otherInfo;
         }
     
         @Override
         public String toString() {
             return "Student{" +
                     "name='" + name + '\'' +
                     ", age=" + age +
                     ", gender='" + gender + '\'' +
                     ", otherInfo=" + Arrays.toString(otherInfo) +
                     '}';
         }
     }
     
     package io;
     
     import java.io.FileNotFoundException;
     import java.io.FileOutputStream;
     import java.io.IOException;
     import java.io.ObjectOutputStream;
     
     /**
      * 对象流:处理流/高级流---ObjectInputStream和ObjectOutputStream
      * 1)作用:进行对象的序列化和反序列化
      * 2)对象序列化:将一个java对象转换为一组字节的过程称为对象序列化
      *   对象反序列化:将一组字节还原为java对象
      */
     public class OOSDemo {
         public static void main(String[] args) throws IOException {
             String name = "张三";
             int age = 25;
             String gender = "男";
             String[] otherInfo = {"是一名学生","黑龙江佳木斯的","喜欢打篮球","喜欢王老师"};
             Student zs = new Student(name,age,gender,otherInfo);
             System.out.println(zs);
             /**
              * 对象输出流的writeObject()可以进行对象的序列化
              * 对象输出流在序列化对象时，必须保证序列化对象必须实现Serializable接口
              * 若没有实现序列化接口会发生NotSerializableException异常
              */
             FileOutputStream fos = new FileOutputStream("student.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             oos.writeObject(zs);
             System.out.println("写出完毕");
             oos.close();
         }
     }
     ```

   - 对象反序列化:将一组字节还原为java对象(前提是这组字节是一个对象序列化得到的字节)

     ```java
     package io;
     
     import java.io.*;
     
     /**
      * 使用对象输入流进行对象的反序列化
      * 反序列化:将一组字节还原为java对象
      */
     public class OISDemo {
         public static void main(String[] args) throws IOException, ClassNotFoundException {
             /*
               Object readObject():
               对象输入流的readObject()可以进行对象的反序列化
               注意:对象输入流通过下面所连接的流来读取的字节
                   必须是对象输出流序列化对象之后的一组字节
                   说白了：序列化的是学生对象，反序列化出来的也一定是学生对象
              */
             FileInputStream fis = new FileInputStream("student.obj");
             ObjectInputStream ois = new ObjectInputStream(fis);
             Object obj = ois.readObject();
             Student zs = (Student)obj;
             System.out.println(zs);
             ois.close();
         }
     }
     ```

4. IO将流按照读写单位划分为字节流和字符流：

   - 字节流的超类: InputStream和OutputStream，以字节为单位读写数据的流

   - 字符流的超类：Reader和Writer，以字符为单位读写数据的流

     > 注意：
     >
     > 1. 这两组超类是平级关系，互相不存在继承关系
     > 2. 字节流分低级流也有高级流，文件流为低级流，缓冲流和对象流为高级流
     > 3. 字符流都是高级流
     > 4. 字符流最小读写单位为字符(char),但是底层实际还是读写字节,只是字符与字节的转换工作由字符流完成.

5. 常用的字节流有三种：

   - 文件流：是一组低级流(见昨天的笔记)
   - 缓冲流：是一组高级流(见上)
   - 对象流：是一组高级流(见上)

6. 常用的字符流有两种：

   - 转换流：是一组高级流
   - ...........-----明天讲：

7. 转换流：是一对高级流，它们是字符流非常常用的一对实现类同时也是一对高级流,实际开发中我们不直接操作它们,但是它们在流连接中是非常重要的一环.

   - 转换流在在流连接中的意义:由于其它字符流在流连接中要求只能连接在其它字符流上，而不能直接连接在字节流上，原因:字符流是以字符为单位读写，而字节流是以字节为单位读写，读写单位不同，因此不能直接串联在一起工作。转换流是一对字符流，并且是唯一可以直接连接在字节流上的字符流。因此其它字符流都只能连接在转换流上，而转换再连接在字节流上，实现串联起写读写

   ```java
   package io;
   
   import java.io.FileNotFoundException;
   import java.io.FileOutputStream;
   import java.io.IOException;
   import java.io.OutputStreamWriter;
   import java.nio.charset.StandardCharsets;
   
   public class OSWDemo {
       public static void main(String[] args) throws IOException {
           FileOutputStream fos = new FileOutputStream("osw.txt");
           //创建转换流时通常会指定第2个参数来明确字符集，以此来保证跨平台性
           OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
           osw.write("和我在成都的街头走一走，哦哦哦哦...");
           osw.write("直到所有的灯都熄灭了也不停留");
           System.out.println("写出完毕!");
           osw.close(); //关闭高级流时会自动关闭低级流
       }
   }
   
   package io;
   
   import java.io.FileInputStream;
   import java.io.FileNotFoundException;
   import java.io.IOException;
   import java.io.InputStreamReader;
   import java.nio.charset.StandardCharsets;
   
   /**
    * 使用转换流读取文本数据
    */
   public class ISRDemo {
       public static void main(String[] args) throws IOException {
           FileInputStream fis = new FileInputStream("osw.txt");
           InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
           /*
             int read()
             读取1个字符(到底读取几个字节要根据它的内容以及对应的字符集来决定)
             返回的int值实际上是一个char，返回-1表示读取了末尾
            */
           int d;
           while((d=isr.read())!=-1){
               System.out.print((char)d);
           }
           isr.close();
       }
   }
   ```



## 补充:

1. 明日单词：

   ```java
   1)throw:抛出、扔出
   2)error:错误
   3)runtime:运行时
   4)stack:堆栈
   5)trace:追溯、追踪
   6)exception:异常
   ```



## 作业：----每人最少2遍

1. 缓冲流实现文件的复制------CopyDemo3Buffered
2. 对象流读写对象---------------Student+OOSDemo+OISDemo
3. 转换流读写字符---------------OSWDemo+ISRDemo
