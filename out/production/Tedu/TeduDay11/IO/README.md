# API基础第六天：

## 回顾：

1. 二进制：计算机中的变量/常量在内部都是按照二进制来操作的

   - 正数：所有二进制数位1位置的权相加
   - 负数：用-1减去0位置的权

2. 十六进制：缩写二进制

   - 2进制转16进制：从低位开始，每4位一缩

3. 补码：

   - 计算机处理有符号数(正负数)的一种编码方式
   - 以4位二进制为例：
     - 计算时若超出4位则高位溢出舍弃，一直保持4位不变
     - 将4位2进制数分一半作为负数
     - 最高位称为符号位，高位为1是负数，高位为0是正数
   - 规律数：
     - 最大值：01111111....
     - 最小值：10000000....
     - -1：1111111111....

4. File：每一个实例都表示了硬盘中的一个文件或目录，但实际上它只表示一个抽象路径而已，只不过这个路径在硬盘上是真实存在的。

5. File的常用方法：

   - getName()：文件名
   - length()：长度
   - isHidden()：是否隐藏
   - canRead()：是否可读
   - canWrite()：是否可写
   - exists()：是否存在
   - createNewFile()：创建新文件
   - mkdir()/mkdirs()：创建新目录
   - delele()：删除
   - isFile()：是否是文件
   - isDirectory()：是否是目录
   - listFiles()：获取子项

   

## 精华笔记：

1. IO：可以让我们用标准的读写操作来完成对不同设备的读写数据工作。java将IO按照方向划分为输入与输出,参照点是我们写的程序

   - 输入：用来读取数据的,是从外界到程序的方向,用于获取数据。

   - 输出：用来写出数据的,是从程序到外界的方向,用于发送数据。

2. java将IO比喻为"流"，即：stream。 就像生活中的"电流"、"水流"一样，它是以同一个方向顺序移动的过程.只不过这里流动的是字节(2进制数据)。所以在IO中有输入流和输出流之分，我们理解他们是连接程序与另一端的"管道"。用于获取或发送数据到另一端。

3. Java定义了两个超类(抽象类)：

   - java.io.InputStream：所有字节输入流的超类，其中定义了读取数据的方法，因此将来不管读取的是什么设备(连接该设备的流)都有这些读取的方法，因此我们可以用相同的方法读取不同设备中的数据
   - java.io.OutputStream：所有字节输出流的超类,其中定义了写出数据的方法.

4. 文件流：用于读写文件数据的流，用于连接程序与文件(硬盘)的"管道"，负责读写文件数据.

   - java.io.FileOutputStream：文件输出流
   - java.io.FileInputStream：文件输入流

5. 单字节写：

6. 单字节读：

7. 单字节文件复制：慢

8. 块读写的文件复制操作：快

9. 写文本数据：

10. 读取文本数据：





## 笔记：

1. IO：可以让我们用标准的读写操作来完成对不同设备的读写数据工作。java将IO按照方向划分为输入与输出,参照点是我们写的程序

   - 输入：用来读取数据的,是从外界到程序的方向,用于获取数据。

   - 输出：用来写出数据的,是从程序到外界的方向,用于发送数据。

2. java将IO比喻为"流"，即：stream。 就像生活中的"电流"、"水流"一样，它是以同一个方向顺序移动的过程.只不过这里流动的是字节(2进制数据)。所以在IO中有输入流和输出流之分，我们理解他们是连接程序与另一端的"管道"。用于获取或发送数据到另一端。

3. Java定义了两个超类(抽象类)：

   - java.io.InputStream：所有字节输入流的超类，其中定义了读取数据的方法，因此将来不管读取的是什么设备(连接该设备的流)都有这些读取的方法，因此我们可以用相同的方法读取不同设备中的数据
   - java.io.OutputStream：所有字节输出流的超类,其中定义了写出数据的方法.

4. 文件流：用于读写文件数据的流，用于连接程序与文件(硬盘)的"管道"，负责读写文件数据.

   - 文件输出流java.io.FileOutputStream：
   - 文件输入流java.io.FileInputStream：

5. 单字节写：

   ```java
   package io;
   
   import java.io.File;
   import java.io.FileNotFoundException;
   import java.io.FileOutputStream;
   import java.io.IOException;
   
   /**
    *  IO: Input和Output，即：输入与输出
    *
    *  Java将输入和输出用"流Stream"表达，分为输入流和输出流，
    *  我们可以将它们想象为连接我们的程序和另一个设备之间的"管道"，通过它们可以读写设备
    *  Java将输入流和输出流定义了两个对应的超类InputStream和OutputStream:
    *  1)InputStream:
    *     输入流，方向是从外界到程序的方向，用于读取数据的流，是一个抽象类，定义了读取字节的相关方法
    *  2)OutputStream:
    *     输出流，方向是从程序到外界的方向，用于写出数据的流，是一个抽象类，定义了写出字节的相关方法
    *
    *  文件流: FileInputStream和FileOutputStream
    *  文件流继承自InputStream和OutputStream，用于对文件进行读写操作
    */
   public class FOSDemo {
       public static void main(String[] args) throws IOException {
           /*
             文件输出流两个常用的构造器:
             1)FileOutputStream(String fileName)
             2)FileOutputStream(File file)
             文件流创建时如果指定的文件不存在则会自动创建，前提是该文件所在的目录必须存在，若不存在则发生异常
            */
           File file = new File("fos.dat");
           FileOutputStream fos = new FileOutputStream(file,true); //根据File实例定义文件输出流
           //FileOutputStream fos = new FileOutputStream("fos.dat"); //定义文件输出流
           /*
             OutputStream(所有字节输出流的超类)上定义了写出字节的相关方法:write()
             void write(int d):
               通过该输出流向目标位置写出1个字节，写出的是给定的int值对应的2进制的"低八位"
   
             当fos.write(1)时，向fos.dat中写入了1个字节
             int值1的2进制样子: 00000000 00000000 00000000 00000001
                                                        ^^^^^^^^
                                                        写入该字节
             write()后，fos.dat文件内容(长度为1字节):
             00000001
   
             当fos.write(2)时，又向fos.dat中写入了1个字节
             int值2的2进制样子: 00000000 00000000 00000000 00000010
                                                         ^^^^^^^^
                                                         写入该字节
             write()后，fos.dat文件内容(长度为2字节):
             00000001 00000010
            */
           /*
             当fos.write(-1)时，向fos中写入了1个字节
             int值-1的2进制样子：11111111 11111111 11111111 11111111
                                                         ^^^^^^^^
                                                         写入该字节
             write()后，fos.dat文件内容
             11111111
            */
           fos.write(1); //向fos.dat中写入了1个字节
           fos.write(2); //向fos.dat中又写入了1个字节
           //fos.write(-1);
   
           //认为读出256的发花  认为读出255的发火箭  认为读出0的发666  认为读出1的发小汽车
           System.out.println("写出完毕!");
           fos.close(); //关闭流
       }
   }
   ```

6. 单字节读：

   ```java
   package io;
   
   import java.io.FileInputStream;
   import java.io.FileNotFoundException;
   import java.io.IOException;
   
   /**
    * 文件输入流，读取文件数据
    */
   public class FISDemo {
       public static void main(String[] args) throws IOException {
           /*
             FileInputStream(String filename)
             FileInputStream(File file)
             上述两种构造器创建文件输入流时，如果参数表达的是一个文件则可以正常实例化
             若表达的文件不存在或表达的是一个目录则会抛出异常
            */
           FileInputStream fis = new FileInputStream("fos.dat"); //定义文件输入流
           /*
             InputStream超类上定义了读取一个字节的方法:(所有的字节输入流都具有该方法)
             int read():读取1个字节，并以int形式返回
             1)返回的int值对应的2进制中只有"低八位"是有效的，高24位全部补0
             2)如果该方法返回的int值为-1(32个1)时，则表示流读取了末尾
   
   
             第1次调用: int d = fis.read(); //读取第1个字节
             fos.dat的数据:
               00000001 00000010 文件末尾
               ^^^^^^^^
               读取的字节
   
               此时变量d对应的2进制样子: 00000000 00000000 00000000 00000001
                                    |------补充24个0-----------| 读取的字节----十进制的1
   
             第2次调用: d = fis.read(); //读取了第2个字节
             fos.dat的数据:
               00000001 00000010 文件末尾
                        ^^^^^^^^
                        读取的字节
               此时变量d对应的2进制样子: 00000000 00000000 00000000 00000010
                                    |------补充24个0-----------| 读取的字节----十进制的2
   
             第3次调用: d = fis.read(); //读取了文件末尾
             fos.dat的数据:
               00000001 00000010 文件末尾
                                 ^^^^^^^
                                 没有字节了
              此时变量d对应的2进制样子: 11111111 11111111 11111111 11111111
                                   |-------------32个二进制的1----------|----十进制的-1
            */
           /*
             调用: int d = fis.read();
             fos.dat的数据:
             11111111 文件末尾
             ^^^^^^^^
             此时变量对应的2进制样子: 00000000 00000000 00000000 11111111
                                 |------补充24个0-----------| 读取的字节----十进制的255
            */
           int d = fis.read(); //读取第1个字节
           System.out.println(d); //输出10进制数据:1
           //d = fis.read(); //读取了第2个字节
           //System.out.println(d); //输出10进制数据:2
           //d = fis.read(); //读取文件末尾了
           //System.out.println(d); //输出10进制数据:-1，表示到文件末尾了
   
           fis.close(); //关闭流
   
       }
   }
   ```

7. 单字节文件复制：慢

   ```
   package io;
   
   import java.io.FileInputStream;
   import java.io.FileNotFoundException;
   import java.io.FileOutputStream;
   import java.io.IOException;
   
   /**
    * 文件复制:将一个文件中的数据读出来，然后写入到另一个文件中
    */
   public class CopyDemo {
       public static void main(String[] args) throws IOException {
           FileInputStream fis = new FileInputStream("zsw.jpg");
           FileOutputStream fos = new FileOutputStream("zsw_cp.jpg");
   
           /*
             zsw.jpg图片数据:
               11101011 10011010 01101101 11101111 10011001 00111010 01101110...
             第1次调用: d=fis.read();
               11101011 10011010 01101101 11101111 10011001 00111010 01101110...
               ^^^^^^^^
               读取的字节
   
               fos.write(d); //将d对应的2进制的"低八位"写入到文件zsw_cp.jpg
               d: 00000000 00000000 00000000 11101011
                                             ^^^^^^^^
                                             写入的字节
   
               zsw_cp.jpg的内容:
               11101011
   
             ......
   
            */
           long start = System.currentTimeMillis(); //自1970年1月1日0时到此时此刻的毫秒数
           int d; //记录每次读取到的字节
           while((d=fis.read())!=-1){ //每次循环读取1个字节到d中，判断若不是-1，表示没有读取末尾
               fos.write(d); //将读出来的字节写入到要复制的文件中
           }
           long end = System.currentTimeMillis();
           System.out.println("复制完毕!耗时:"+(end-start)+"ms");
   
           fis.close();
           fos.close();
       }
   }

8. 块读写的文件复制操作：快

   ```java
   package io;
   
   import jdk.management.resource.internal.inst.SimpleAsynchronousFileChannelImplRMHooks;
   
   import java.io.FileInputStream;
   import java.io.FileNotFoundException;
   import java.io.FileOutputStream;
   import java.io.IOException;
   
   /*
     通过提高每次读写的数据量减少实际读写的次数，可以提供读写的效率
     一组字节的读写:块读写
    */
   public class CopyDemo2 {
       public static void main(String[] args) throws IOException {
           FileInputStream fis = new FileInputStream("zsw.jpg");
           FileOutputStream fos = new FileOutputStream("zsw_cp2.jpg");
   
           /*
             InputStream超类中定义了块读取数据的方法:
             int read(byte[] data)
             一次性读取给定的字节数组data总长度的字节量，并存入到字节数组中，
             返回值表示实际读取到了多少个字节，若返回-1表示读到了末尾
   
             OutputStream超类上也定义了块写字节的方法:
             void write(byte[] data)
             一次性将给定的字节数组data中的所有字节写出
             void write(byte[] data,int offset,int len)
             一次性将给定的字节数组data从下标offset处开始的连续len个字节写出
            */
           /*
             zsw.jpg图片数据:
               11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
             byte[] data = new byte[3]; //3个字节
   
              第1次调用fis.read(data)时:----一次性读取3个字节
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
              ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
              |-----本次读到的3个字节-----|
              data: {11101011 10011010 01101101}
              第1次调用fos.write(data)时:----一次性写入3个字节
              zsw_cp2.jpg图片数据:
              11101011 10011010 01101101
   
              第2次调用fis.read(data)时:----一次性读取3个字节
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                         ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                         |-----本次读到的3个字节-----|
              data:{11101111 10011001 00111010} //将第1次读的3个字节完整替换
              第2次调用fos.write(data)时:----一次性写入3个字节
              zsw_cp2.jpg图片数据:
              11101011 10011010 01101101 11101111 10011001 00111010
   
              第3次调用fis.read(data)时:----一次性读取3个字节
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                                                    ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                    仅读取到1个字节
              data:{01101110 10011001 00111010} //将第2次读取的第1个字节替换了，后两个还是上次的数据
                   |-读取的-| |-----旧数据------|
              实际只读取了1个字节，所以也只写入1个字节
              zsw_cp2.jpg图片数据:
              11101011 10011010 01101101 11101111 10011001 00111010 01101110
            */
           long start = System.currentTimeMillis();
           byte[] data = new byte[1024*10]; //10kb
           int len; //记录每次实际读取的字节数
           while((len=fis.read(data))!=-1){ //每次读取10kb并判断是否读取到了末尾
               //将字节数组byte从下标0开始连续len个字节写出(做到读多少就写多少)
               fos.write(data,0,len);
           }
           long end = System.currentTimeMillis();
           System.out.println("复制完毕!耗时:"+(end-start)+"ms");
   
           fis.close();
           fos.close();
   
   		
           /*
             zsw.jpg图片数据:
               11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
             byte[] data = new byte[3]; //3个字节
   
              第1次调用fis.read(data)时:----一次性读取3个字节
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
              ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
              |-----本次读到的3个字节-----|
              data: {11101011 10011010 01101101}
              第1次调用fos.write(data)时:----一次性写入3个字节
              zsw_cp2.jpg图片数据:
              11101011 10011010 01101101
   
              第2次调用fis.read(data)时:----一次性读取3个字节
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                         ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                         |-----本次读到的3个字节-----|
              data:{11101111 10011001 00111010} //将第1次读的3个字节完整替换
              第2次调用fos.write(data)时:----一次性写入3个字节
              zsw_cp2.jpg图片数据:
              11101011 10011010 01101101 11101111 10011001 00111010
   
              第3次调用fis.read(data)时:----一次性读取3个字节
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 文件末尾
                                                                    ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                    仅读取到1个字节
              data:{01101110 10011001 00111010} //将第2次读取的第1个字节替换了，后两个还是上次的数据
                   |-读取的-| |-----旧数据------|
              zsw_cp2.jpg图片数据:
              11101011 10011010 01101101 11101111 10011001 00111010 01101110 10011001 00111010
            */
           /*
           long start = System.currentTimeMillis();
           byte[] data = new byte[1024*10]; //10kb
           while(fis.read(data)!=-1){ //每次读取10kb并判断是否读取到了末尾
               fos.write(data); //一次写入10kb数据
           }
           long end = System.currentTimeMillis();
           System.out.println("复制完毕!耗时:"+(end-start)+"ms");
   
           fis.close();
           fos.close();
            */
   
       }
   }
   ```

9. 写文本数据：

   ```java
   package io;
   
   import java.io.FileNotFoundException;
   import java.io.FileOutputStream;
   import java.io.IOException;
   import java.nio.charset.StandardCharsets;
   
   /**
    * 向文件中写入文本数据
    */
   public class WriteStringDemo {
       public static void main(String[] args) throws IOException {
           FileOutputStream fos = new FileOutputStream("fos.txt",true);
   
           /*
             文字与2进制的对应关系有各种标准：字符集------了解
             支持中文的字符集常见的有:
             1)UTF-8：unicode的转换编码
               1.1)英文、符号、数字各占1个字节，但中文占3个字节
             2)GBK:国标编码
               2.1)英文、符号、数字各占1个字节，但中文占2个字节
            */
           String line = "心在跳是爱情如烈火，你在笑疯狂的人是我";
           byte[] data = line.getBytes(StandardCharsets.UTF_8); //将line的内容按照utf-8编码转换为字节数组
           fos.write(data);
           fos.write("，爱如火会温暖了心窝".getBytes(StandardCharsets.UTF_8));
   
           System.out.println("写出完毕!");
           fos.close();
       }
   }
   ```

10. 读取文本数据：

    ```java
    package io;
    
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.nio.charset.StandardCharsets;
    
    /**
     * 读取文本数据
     */
    public class ReadStringDemo {
        public static void main(String[] args) throws IOException {
            File file = new File("fos.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int)file.length()]; //创建与文件等长的字节数组
            fis.read(data); //一次性读取数据到data中
            String line = new String(data, StandardCharsets.UTF_8); //将data中的字节还原为字符串
            System.out.println(line);
            fis.close();
        }
    }
    ```



## 补充：

1. 明日单词：

   ```java
   1)Buffer：缓冲
   2)flush：冲水，咱们使用时是清空缓冲区的作用
   3)ClassNotFound：类没有找到
   4)Serializable：可序列化
   5)Standard：标准的
   6)auto：自动的
   7)Ignore：忽略
   ```