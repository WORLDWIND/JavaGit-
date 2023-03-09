# API基础第八天：

## 回顾：

1. java将流分为节点流和处理流两类：

   - 节点流：也称为低级流，是真实连接程序和另一端的"管道"，负责实际读写数据的流，读写一定是建立在节点流的基础之上的，节点流好比家里的"自来水管"，连接我们的家庭和自来水厂，负责搬运水。就一对：文件流FileInputStream和FileOutputStream。

   - 处理流：也称为高级流，不能独立存在，必须连接在其它流上，目的是当数据经过处理流时对其进行某种加工处理，简化我们对数据的同等操作。高级流好比家里常用的对水进行加工的设备，比如"净水器"、"热水器"，有了它们我们就不必再自己对水进行加工了，简化操作。有好多对。

     > 实际开发中我们经常会串联一组高级流最终连接到低级流上，在读写操作时以流水线式的加工来完成复杂的IO操作，功能叠加，这个过程称为"流连接"。

2. IO将流按照读写单位划分为字节流和字符流：

   - 字节流的超类：InputStream和OutputStream，以字节为单位读写数据的流

   - 字符流的超类：Reader和Writer，以字符为单位读写数据的流

     > 注意：
     >
     > 1. 这两组超类是平行/同级关系，互相不存在继承关系
     > 2. 字节流分低级流(文件流)和高级流(缓冲流、对象流)，但字符流都是高级流(转换流)

3. 缓冲流：是一组高级流，作用是提高读写数据的效率。

4. 对象流：是一组高级流，作用进行对象的序列化和反序列化

5. 转换流：是一组高级流，将字符转换为字节，在实际应用中我们不直接操作转换流，它在流连接中是非常重要的一环。意义：其它字符流只能直接连在其它字符流上，而不能直接连在字节流上，只有转换流才能直接连在字节流上进行转换操作，所以常常在流连接时使用转换流串联读写。



## 精华笔记：

1. 缓冲字符流：BufferedWriter/PrintWriter和BufferedReader

   - 内部也有一个缓冲区，读写文本数据以块读写形式加快效率
   - 缓冲字符流有一个特别的功能：可以按行读写文本数据。
   - PrintWriter具有自动行刷新的缓冲字符输出流，实际开发中更常用，它内部总是会自动连接BufferedWriter作为块写加速使用。

2. IO总结：

   - 文件流：低级流/节点流，字节流--------------FileInputStream和FileOutputStream
     - 作用：实际连接程序与文件的"管道"，读写字节(单字节读写、块读写)
   - 缓冲字节流：高级流/处理流，字节流--------BufferedInputStream和BufferedOutputStream
     - 作用：块读写字节数据加速
   - 对象流：高级流/处理流，字节流---------------ObjectInputStream和ObjectOutputStream
     - 作用：对象序列化和反序列化
   - 转换流：高级流/处理流，字符流---------------InputStreamReader和OutputStreamWriter
     - 作用：衔接字符流与字节流、将字符转换为字节
   - 缓冲字符流：高级流/处理流，字符流---------BufferedReader和BufferedWriter/PrintWriter
     - 作用：块读写文本字符数据加速、按行读写字符串(PrintWriter具有自动行刷新功能)

3. 流的选择：读写java对象就用对象流，想读写字符串就是缓冲字符流

4. 异常：

   - java.lang.Throwable是所有异常的顶级超类，它的下面派生了两个子类型：
     - Error：错误，表示系统级别错误，是不可恢复的错误，比如说：虚拟机内存溢出等，Error通过异常处理机制是处理不了的。
     - Exception：异常/意外，表示程序级别的异常，是可以通过异常处理机制恢复的错误，下面有多个派生类表达不同的异常类型

5. 异常处理机制解决的问题：

   - 正常程序能走完，但因为某些特殊原因(网络问题、突发情况)导致程序无法正常走完，属于意外情况，通过程序逻辑(分支/循环)是无法解决了，这时才需要使用异常处理机制来做个B计划。直白的说：你明知道会发生，但是还没办法通过逻辑来处理的问题，才需要异常处理机制帮助解决。

     > 异常追责过程：
     >
     > 1. 当发生错误时，JVM会new一个异常出来，要求代码必须解决。
     > 2. 若代码中没有做异常处理，则找到代码所在的方法来处理
     > 3. 若代码所在的方法也没有处理，会继续往上追方法，直到追到main方法
     > 4. 若main方法也没有处理，则继续找到调用main方法的JVM，最后程序直接终止

6. 异常处理机制：

   - try...catch：若try中代码出现异常，将会被catch捕获，若catch没有捕获住，则程序依然被杀死

   - finally：是异常处理机制中的最后一块，不能独立存在，它可以跟着try后(try...finally)，或最后一个catch后(try...catch...finally)。

     > 注意：
     >
     > 1. finally可以保证无论try块中是否出现异常，最后finally都必定执行。通常用来做释放资源这类操作。
     > 2. JDK7之后，java提供了一个新特性：自动关闭特性。旨在IO操作中可以更简洁的使用异常处理机制完成最后的close操作。

   - throw：用于对外主动抛出一个异常，通常下面两种情况我们主动对外抛出异常：

     - 当程序遇到一个满足语法，但是不满足业务要求时，可以抛出一个异常告知调用者。
     - 程序执行遇到一个异常，但是该异常不应当在当前代码片段中被解决时可以抛出给调用者。

   - throws：明天讲



## 笔记：

1. 缓冲字符流：BufferedWriter/PrintWriter和BufferedReader

   - 内部也有一个缓冲区，读写文本数据以块读写形式加快效率

   - 缓冲字符流有一个特别的功能：可以按行读写文本数据。

   - PrintWriter具有自动行刷新的缓冲字符输出流，实际开发中更常用，它内部总是会自动连接BufferedWriter作为块写加速使用。

     ```java
     package io;
     import java.io.*;
     import java.nio.charset.StandardCharsets;
     
     /*
     缓冲字符流-------最常用的读写字符串的流
     是一对高级流，并且是字符流
     内部维护一个默认8KB(8192)长度的char数组，还是以块读写形式读写字符以提高读写效率
     BuffredWriter和BufferedReader
     
     PrintWriter:按行写入数据
      */
     public class PWDemo {
         public static void main(String[] args) throws IOException {
             //最常用写入字符串方式:
             //底层连接了BufferedWriter，连接了OutputStreamWriter，连接了FileOutputStream
             PrintWriter pw = new PrintWriter("pw.txt");
             pw.println("和我在成都的街头走一走，哦哦哦哦..");
             pw.println("直到所有的灯都熄灭了也不停留");
             System.out.println("写出完毕");
             pw.close();
     
             /*
             FileOutputStream fos = new FileOutputStream("pw.txt"); //文件流(低级流)
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); //转换流(高级流)
             BufferedWriter bw = new BufferedWriter(osw); //缓冲字符流(高级流)
             bw.write("和我在成都的街头走一走，哦哦哦哦..");
             bw.write("直到所有的灯都熄灭了也不停留");
             System.out.println("写出完毕!");
             bw.close(); //先调用flush()冲水
              */
         }
     }
     
     package io;
     
     import java.io.*;
     import java.nio.charset.StandardCharsets;
     import java.util.Scanner;
     
     /**
      *
      */
     public class PWDemo2 {
         public static void main(String[] args) throws FileNotFoundException {
             //文件流(字节流，低级流):将字节写入到文件中
             FileOutputStream fos = new FileOutputStream("pw.txt");
             //转换流(字符流，高级流):1.负责衔接字符流与字节流  2.将写出的字符转换为字节再写出
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             //缓冲字符流(字符流，高级流):块文本数据加速(内部缓冲区默认8192个char)
             BufferedWriter bw = new BufferedWriter(osw);
             //PrintWriter(字符流，高级流): 1.按行写出字符串  2.具有自动行刷新功能
             //构造器第1个参数为流，第2个参数可以传入boolean类型的数据来表示是否打开自动刷新功能(flush)
             PrintWriter pw = new PrintWriter(bw,true);
     
             Scanner scan = new Scanner(System.in);
             System.out.println("请开始输入内容，单独输入exit时退出");
             while(true){
                 String line = scan.nextLine();
                 if("exit".equals(line)){
                     break;
                 }
                 //当开启自动行刷新后，每当调用println()方法写出一行后都会自动flush()
                 //注意:print()不会flush的
                 pw.println(line);
             }
             pw.close();
         }
     }
     
     package io;
     
     import java.io.*;
     import java.nio.charset.StandardCharsets;
     
     /**
      * 缓冲字符输入流读取文本数据
      */
     public class BRDemo {
         public static void main(String[] args) throws IOException {
             //文件流(字节流，低级流)
             FileInputStream fis = new FileInputStream("pw.txt");
             //转换流(字符流，高级流)
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             //缓冲字符流(字符流，高级流)
             BufferedReader br = new BufferedReader(isr);
             /*
               String readLine():
               读取一行字符串，返回的字符串中不包含最后的换行符
               如果单独读取到了换行符(一个空行)则返回值为空字符串("")
               如果返回值为null，则表示读到了末尾
              */
             String line;
             while((line=br.readLine())!=null){
                 System.out.println(line); //换行输出
                 //System.out.print(line); //没有换行操作
             }
             br.close();
     
         }
     }
     ```

2. IO总结：

   - 文件流：低级流/节点流，字节流--------------FileInputStream和FileOutputStream
     - 作用：实际连接程序与文件的"管道"，读写字节(单字节读写、块读写)
   - 缓冲字节流：高级流/处理流，字节流--------BufferedInputStream和BufferedOutputStream
     - 作用：块读写字节数据加速
   - 对象流：高级流/处理流，字节流---------------ObjectInputStream和ObjectOutputStream
     - 作用：对象序列化和反序列化
   - 转换流：高级流/处理流，字符流---------------InputStreamReader和OutputStreamWriter
     - 作用：衔接字符流与字节流、将字符转换为字节
   - 缓冲字符流：高级流/处理流，字符流---------BufferedReader和BufferedWriter/PrintWriter
     - 作用：块读写文本字符数据加速、按行读写字符串(PrintWriter具有自动行刷新功能)

3. 流的选择：读写java对象就用对象流，想读写字符串就是缓冲字符流

4. 异常：

   - java.lang.Throwable是所有异常的顶级超类，它的下面派生了两个子类型：
     - Error：错误，表示系统级别错误，是不可恢复的错误，比如说：虚拟机内存溢出等，Error通过异常处理机制是处理不了的。
     - Exception：异常/意外，表示程序级别的异常，是可以通过异常处理机制恢复的错误，下面有多个派生类表达不同的异常类型

5. 异常处理机制解决的问题：

   - 正常程序能走完，但因为某些特殊原因(网络问题、突发情况)导致程序无法正常走完，属于意外情况，通过程序逻辑(分支/循环)是无法解决了，这时才需要使用异常处理机制来做个B计划。直白的说：你明知道会发生，但是还没办法通过逻辑来处理的问题，才需要异常处理机制帮助解决。

     > 异常追责过程：
     >
     > 1. 当发生错误时，JVM会new一个异常出来，要求代码必须解决。
     > 2. 若代码中没有做异常处理，则找到代码所在的方法来处理
     > 3. 若代码所在的方法也没有处理，会继续往上追方法，直到追到main方法
     > 4. 若main方法也没有处理，则继续找到调用main方法的JVM，最后程序直接终止

6. 异常处理机制：

   - try...catch：若try中代码出现异常，将会被catch捕获，若catch没有捕获住，则程序依然被杀死

     ```java
     package exception;
     
     /**
      * java异常处理机制: try...catch
      * try{
      *     代码片段
      * }catch(XXXException e){
      *     当try的代码片段出现XXXException时的补救措施
      * }
      */
     public class TryCatchDemo {
         public static void main(String[] args) {
             System.out.println("程序开始了...");
     
             try{
                 /*
                   try块中某句代码如果出现了异常，那么try块中这句代码以下的代码都不执行了
                   try语句中如果不出现异常，catch块不执行
                  */
                 String line = null;
                 System.out.println(line.length());
                 String line1 = ""; //因为上一句发生了异常，所以try块中此句及以下代码都不会被执行了
                 System.out.println(line1.charAt(0));
                 String line2 = "abc";
                 System.out.println(Integer.parseInt(line2));
             }catch(NullPointerException e){ //捕获空指针异常
                System.out.println("出现了空指针异常并解决了"); //处理办法
             }catch(StringIndexOutOfBoundsException e){ //捕获字符串下标越界异常
                System.out.println("出现了字符串下标越界异常并解决了"); //处理办法
             //}catch(NullPointerException | StringIndexOutOfBoundsException e){ //若多个异常具有相同处理方式时，可以合并到一个catch中进行处理
             //   System.out.println("出现空指针或字符串下标越界异常并解决了");
             }catch(Exception e){ //可以在最后捕获超类型异常，凡是该异常的子类型都可以被捕获并处理
                 System.out.println("反正就是出了个错并解决了");
             }
     
             System.out.println("程序结束了...");
         }
     }
     ```

   - finally：是异常处理机制中的最后一块，不能独立存在，它可以跟着try后(try...finally)，或最后一个catch后(try...catch...finally)。

     > 注意：
     >
     > 1. finally可以保证无论try块中是否出现异常，最后finally都必定执行。通常用来做释放资源这类操作。
     > 2. JDK7之后，java提供了一个新特性：自动关闭特性。旨在IO操作中可以更简洁的使用异常处理机制完成最后的close操作。只有实现了AutoCloseable接口的类才能写在try()中，注意：所有流都实现了AutoCloseable接口。

     ```java
     package exception;
     
     /**
      * finally块的演示
      */
     public class FinallyDemo {
         public static void main(String[] args) {
             System.out.println("程序开始了...");
     
             try{
                 //String line = null;
                 String line = "";
                 System.out.println(line.length());
                 return; //在return之前，会先finally再return
             }catch(Exception e){
                 System.out.println("出错并解决了");
             }finally {
                 System.out.println("finally中的代码执行了");
             }
     
             System.out.println("程序结束了...");
     
         }
     }
     
     package exception;
     
     import java.io.FileOutputStream;
     import java.io.IOException;
     
     /**
      * 异常处理机制在IO操作中的运用
      */
     public class FinallyDemo2 {
         public static void main(String[] args) {
             System.out.println("程序开始了");
             FileOutputStream fos = null;
             try{
                 fos = new FileOutputStream("./a/b/fos.dat");
                 fos.write(1);
             }catch (IOException e){
                 System.out.println("出现IO异常并解决了");
             }finally {
                 try {
                     if(fos!=null){
                         fos.close();
                     }
                 }catch (Exception e) {
                     e.printStackTrace();
                 }
             }
             System.out.println("程序结束了");
         }
     }
     
     package exception;
     
     import java.io.FileOutputStream;
     import java.io.IOException;
     
     public class AutoCloseableDemo {
         public static void main(String[] args) {
             System.out.println("程序开始了");
     
             try(
                 //自动关闭特性是编译器认可的，代码编译后会变为FinallyDemo2的样子
                 //在try()中定义的内容最终会被编译器修改为finally中调用close()关闭操作
                 FileOutputStream fos = new FileOutputStream("fos.dat");
     
                 //只有实现了AutoCloseable接口的类才能在此处定义
                 //String str = "abc"; //编译错误
             ){
                 fos.write(1);
             }catch(IOException e){
                 e.printStackTrace();
             }
     
             System.out.println("程序结束了");
         }
     }
     ```

   - throw：用于对外主动抛出一个异常，通常下面两种情况我们主动对外抛出异常：

     - 当程序遇到一个满足语法，但是不满足业务要求时，可以抛出一个异常告知调用者。

       ```java
       package exception;
       
       /**
        * 测试异常的抛出
        */
       public class Student {
           private int age;
       
           public int getAge() {
               return age;
           }
       
           public void setAge(int age) {
               if(age<0 || age>100){
                   throw new RuntimeException(); //抛出了一个异常
               }
               this.age = age;
           }
       }
       
       package exception;
       
       /**
        * 异常的抛出
        */
       public class ThrowDemo {
           public static void main(String[] args) {
               /*
               Student zs = new Student();
               zs.setAge(1000);
               System.out.println("此人的年龄为:"+zs.getAge()+"岁");
                */
       
               Student zs = new Student();
               try{
                   zs.setAge(1000);
                   System.out.println("此人的年龄为:"+zs.getAge()+"岁");
               }catch(RuntimeException e){
                   System.out.println("年龄不合法");
               }
           }
       }
       ```

     - 程序执行遇到一个异常，但是该异常不应当在当前代码片段中被解决时可以抛出给调用者。

   - throws：明天讲



## 补充：

1. 明日单词：

   ```java
   无
   ```

   

## 作业:

1. 缓冲字符流的练习：PWDemo2简要记事本按行写+BRDemo按行读
2. 异常的练习：
   - try...catch：TryCatchDemo
   - finally：FinallyDemo+FinallyDemo2+AutoCloseableDemo
   - throw：Student+ThrowDemo