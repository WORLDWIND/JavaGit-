# API基础第五天：

## 回顾：

1. List接口：继承自Collection接口，可重复集合，并且有序
   - ArrayList：内部使用数组实现，查询性能更好(直接下标找物理地址)，增删性能不好
   - LinkdedList：内部使用链表实现，查询性能不好，首尾增删性能好
2. List集常用方法：
   - get()：根据下标获取元素
   - set()：将指定元素设置到指定位置
   - 重载remove()：根据下标删除元素
   - 重载add()：将指定元素添加到指定位置
   - subList()：获取集合的子集(含头不含尾)
3. 集合的排序：
   - Collections工具类
   - Collections.sort(List list)方法：
   - Collections.sort(List list,Comparator c)方法：
4. Lambda表达式：JDK1.8提供的，简化匿名内部类写法
   - 规则：必须是函数式接口(接口中只有一个方法必须被实现类重写)
5. Set集：不可重复集合，并且大部分实现类都是无序的
6. 什么是二进制：



## 精华笔记：

1. 什么是二进制：逢2进1的计数规则。计算机中的变量/常量都是按照2进制来计算的

   - 2进制：
     - 规则：逢2进1
     - 数字：0  1
     - 基数：2
     - 权：128  64  32  16  8  4  2  1
   - 如何将2进制转换为10进制：
     - 正数：将二进制每个1位置的权相加

2. 十六进制：逢16进1的计数规则

   - 16进制：

     - 规则：逢16进1
     - 数字：0 1 2 3 4 5 6 7 8 9  a  b  c  d  e  f
     - 基数：16
     - 权：4096  256  16  1

   - 用途：因为2进制书写太麻烦，所以常常用16进制来缩写2进制

   - 如何缩写：将2进制从低位开始，每4位2进制缩为1位16进制

     ```java
     权:           8  4  2  1
     2进制:  0001 1011 1110 1010 0101
     16进制:  1    b    e    a    5------------0x1bea5
         
     权:           8  4  2  1
     2进制:  0010 1111 1101 0100 0111 1011
     16进制:  2    f    d    4    7    b-------0x2fd47b
        
     权:           8  4  2  1
     2进制:  0010 1001 0101 1010 1011 1001
     16进制:  2    9    5    a    b    9-------0x295ab9
     ```

3. 补码：-------------------了解

   - 计算机处理有符号数(正负数)的一种编码方式

   - 以4位2进制为例讲解补码的编码规则：

     - 计算机的时候如果超出4位则高位自动溢出舍弃，保持4位不变
     - 将4位2进制数分一半作为负数
     - 最高位称为符号位，高位为1是负数，高位为0是正数

   - 规律数：

     - 0111为4位补码的最大值，规律是1个0和3个1，可以推导出
       - 32位补码的最大值：1个0和31个1---------(01111111111111111111111111111111)
     - 1000为4位补码的最小值，规律是1个1和3个0，可以推导出
       - 32位补码的最小值：1个1和31个0---------(10000000000000000000000000000000)
     - 1111为4位补码的-1，规律是4个1，可以推导出
       - 32位补码的-1：32个1--------------------------(11111111111111111111111111111111)

   - 深入理解负值：

     - 记住32位2进制数的-1的编码：32个1

     - 负值：用-1减去0位置的权

       ```java
       1)11111111111111111111111111111111 = -1
       2)11111111111111111111111111111101 = -1-2 = -3
       3)11111111111111111111111111111010 = -1-1-4 = -6
       4)11111111111111111111111111110111 = -1-8 = -9
       5)11111111111111111111111111110101 = -1-2-8 = -11
       6)11111111111111111111111111010011 = -1-4-8-32= -45
       ```

4. File：

   - File类的每一个实例可以表示硬盘中的一个文件或目录，但实际上它只表示一个抽象路径而已，只不过这个路径在硬盘上是真实存在的。

   - 使用File可以做到：

     - 访问其表示的文件或目录的属性信息,例如:名字,大小,修改时间等等

     - 创建和删除文件或目录

     - 访问一个目录中的子项

       > 注意：File不能访问文件数据

5. File的常用方法：

   - getName()：获取文件或目录的名称
   - length()：获取文件或目录大小
   - isHidden()：获取文件或目录是否为隐藏的
   - canRead()：获取文件或目录是否为可读的
   - canWrite()：获取文件或目录是否为可写的
   - exists()：获取文件或目录是否为已存在的
   - createNewFile()：创建新文件
   - mkdir()/mkdirs()：创建新目录
   - delete()：删除文件或目录
   - isFile()：获取File对象表示的是否为一个文件且存在
   - isDirectory()：获取File对象表示的是否为一个目录且存在
   - listFiles()：获取一个目录中的所有子项



## 笔记：

1. 什么是二进制：逢2进1的计数规则。计算机中的变量/常量都是按照2进制来计算的

   - 2进制：

     - 规则：逢2进1
     - 数字：0  1
     - 基数：2
     - 权：128  64  32  16  8  4  2  1

   - 如何将2进制转换为10进制：

     - 正数：将二进制每个1位置的权相加

     ```java
     public class BinaryDemo {
         public static void main(String[] args) {
             int n = 45; //编译时会被编译为: 101101
             System.out.println(Integer.toBinaryString(n)); //101101，以2进制输出
             System.out.println(n); //45，以10进制输出
     
             n++; //将101101增1----101110
             System.out.println(Integer.toBinaryString(n)); //101110，以2进制输出
             System.out.println(n); //46，以10进制输出
         }
     }
     ```

2. 十六进制：逢16进1的计数规则

   - 16进制：

     - 规则：逢16进1
     - 数字：0 1 2 3 4 5 6 7 8 9  a  b  c  d  e  f
     - 基数：16
     - 权：4096  256  16  1

   - 用途：因为2进制书写太麻烦，所以常常用16进制来缩写2进制

   - 如何缩写：将2进制从低位开始，每4位2进制缩为1位16进制

     ```java
     权:           8  4  2  1
     2进制:  0001 1011 1110 1010 0101
     16进制:  1    b    e    a    5------------0x1bea5
         
     权:           8  4  2  1
     2进制:  0010 1111 1101 0100 0111 1011
     16进制:  2    f    d    4    7    b-------0x2fd47b
        
     权:           8  4  2  1
     2进制:  0010 1001 0101 1010 1011 1001
     16进制:  2    9    5    a    b    9-------0x295ab9
     ```

     ```java
     public class HexDemo {
         public static void main(String[] args) {
             /*
               16进制:缩写2进制
               1)0x为16进制字面量前缀
               2)0b为2进制字面量前缀，可以加下划线---一般不用，一般都是16进制缩写
               3)计算机内部没有10进制，也没有16进制，只有2进制
               4)Integer.toHexString()可以将16进制数返回
                 显示16进制:System.out.println(Integer.toHexString(n));
              */
             /*
             int n = 0x2fd47b; //0x表示16进制
             int m = 0b10_1111_1101_0100_0111_1011; //0b表示2进制
             System.out.println(Integer.toBinaryString(n)); //按2进制输出
             System.out.println(Integer.toBinaryString(m));
             System.out.println(Integer.toHexString(n)); //按16进制输出
             System.out.println(Integer.toHexString(m));
             System.out.println(n); //按10进制输出
             System.out.println(m);
              */
     
             /*
               8进制: 以0开头------------平时不用
               1)规则:逢8进1
               2)数字:0 1 2 3 4 5 6 7
               3)基数:8
               4)权:512 64 8 1
              */
             int a = 067; //以0开头的表示8进制
             System.out.println(a); //55(6个8+7个1)
             /*
               小面试题:
               int a = 068; 正确吗?
               答:编译错误，因为0开头的表示8进制，8进制最大数字为7
              */
         }
     }
     ```

3. 补码：-------------------了解

   - 计算机处理有符号数(正负数)的一种编码方式

   - 以4位2进制为例讲解补码的编码规则：

     - 计算机的时候如果超出4位则高位自动溢出舍弃，保持4位不变
     - 将4位2进制数分一半作为负数
     - 最高位称为符号位，高位为1是负数，高位为0是正数

   - 规律数：

     - 0111为4位补码的最大值，规律是1个0和3个1，可以推导出
       - 32位补码的最大值：1个0和31个1---------(01111111111111111111111111111111)
     - 1000为4位补码的最小值，规律是1个1和3个0，可以推导出
       - 32位补码的最小值：1个1和31个0---------(10000000000000000000000000000000)
     - 1111为4位补码的-1，规律是4个1，可以推导出
       - 32位补码的-1：32个1--------------------------(11111111111111111111111111111111)

   - 深入理解负值：

     - 记住32位2进制数的-1的编码：32个1

     - 负值：用-1减去0位置的权

       ```java
       1)11111111111111111111111111111111 = -1
       2)11111111111111111111111111111101 = -1-2 = -3
       3)11111111111111111111111111111010 = -1-1-4 = -6
       4)11111111111111111111111111110111 = -1-8 = -9
       5)11111111111111111111111111110101 = -1-2-8 = -11
       6)11111111111111111111111111010011 = -1-4-8-32= -45
       ```

       ```java
       public class ComplementDemo {
           public static void main(String[] args) {
               /*
               //规律数:
               int max = Integer.MAX_VALUE; //int的最大值
               int min = Integer.MIN_VALUE; //int的最小值
               System.out.println(Integer.toBinaryString(max));  //0111111...
               System.out.println(Integer.toBinaryString(min));  //1000000...
               System.out.println(Integer.toBinaryString(-1));  //111111...
                */
       
               int n = -45;
               System.out.println(Integer.toBinaryString(n)); //2进制显示
               System.out.println(n); //10进制显示
       
           }
       }
       ```

4. File：

   - File类的每一个实例可以表示硬盘中的一个文件或目录，但实际上它只表示一个抽象路径而已，只不过这个路径在硬盘上是真实存在的。

   - 使用File可以做到：

     - 访问其表示的文件或目录的属性信息,例如:名字,大小,修改时间等等

     - 创建和删除文件或目录

     - 访问一个目录中的子项

       > 注意：File不能访问文件数据

5. File的常用方法：

   - getName()：获取文件或目录的名称

   - length()：获取文件或目录大小

   - isHidden()：获取文件或目录是否为隐藏的

   - canRead()：获取文件或目录是否为可读的

   - canWrite()：获取文件或目录是否为可写的

     ```java
     public class FileDemo {
         public static void main(String[] args) {
             //绝对路径：从盘符开始，不利于跨平台(你的硬盘不一定有)
             //File file = new File("C:/Users/TEDU/IdeaProjects/jsd2302/demo.txt");
     
             //相对路径:相对于某个位置开始，有利于跨平台
             //常用的相对路径有: 1)"./"表示当前目录  2)类加载路径(后期讲)
             //"./"在Idea执行程序时表达的是当前类所在的项目目录，此处指jsd2302这个目录的位置
             File file = new File("./demo.txt");
     
             String name = file.getName(); //获取file表示的文件或目录的名字
             System.out.println("name:"+name);
     
             //长度为0有两种情况: 1.路径无效  2.确实文件没有内容
             long len = file.length(); //获取file表示的文件或目录的长度(大小)
             System.out.println("length:"+len);
     
             boolean ih = file.isHidden(); //文件是否是隐藏的
             boolean cr = file.canRead();  //文件是否可读
             boolean cw = file.canWrite(); //文件是否可写
             System.out.println("是否隐藏:"+ih); //false
             System.out.println("是否可读:"+cr); //true
             System.out.println("是否可写:"+cw); //true
     
         }
     }
     ```

   - exists()：获取文件或目录是否为已存在的

   - createNewFile()：创建新文件

     ```java
     public class CreateNewFileDemo {
         public static void main(String[] args) throws IOException {
             /*
             //在当前目录下创建10个文件，名字为test1.txt---test10.txt
             for(int i=1;i<=10;i++){
                 File file = new File("./test"+i+".txt");
                 if(!file.exists()){
                     file.createNewFile();
                 }
             }
             System.out.println("创建完毕!");
             */
     
     
             File file = new File("./test.txt");
             //判断当前file表示的路径是否存在了对应的文件或目录，若已经存在则返回ture，否则返回false
             if(file.exists()){
                 System.out.println("文件已存在");
             }else{
                 //将file表示的文件真实的创建出来，注意:若要创建文件的目录不存在，则会发生异常
                 //该方法要求处理异常:将光标留在方法上，然后alt+回车，选第一项add exception
                 file.createNewFile();
                 System.out.println("该文件已创建!");
             }
         }
     }
     ```

   - mkdir()/mkdirs()：创建新目录

     ```java
     public class MkDirDemo {
         public static void main(String[] args) {
             //File dir = new File("./a/b/c");
             File dir = new File("./demo");
             if(dir.exists()){
                 System.out.println("该目录已存在");
             }else{
                 //该方法要求你创建的目录所在的目录必须存在，若不存在不会报错，但是也不会进行创建(相当于不执行)
                 //dir.mkdir(); //将File对象表示的目录实际创建出来
                 dir.mkdirs(); //该方法创建目录时会连同将所有不存在的父目录一同创建出来(推荐使用)
                 System.out.println("该目录已创建");
             }
         }
     }
     ```

   - delete()：删除文件或目录

     ```java
     public class DeleteFileDirDemo {
         public static void main(String[] args) {
             //File f = new File("./test.txt"); //文件
             //File f = new File("./demo"); //删除demo
             //File f = new File("./a/b/c"); //删除a下的b下的c
             File f = new File("./a"); //a目录中有内容，所以不能直接被删除
             if(f.exists()){
                 f.delete(); //删除file所表示的文件或目录，只能空目录时才能正确删除
                 System.out.println("该文件或目录已删除");
             }else{
                 System.out.println("该文件或目录不存在");
             }
         }
     }
     ```

   - isFile()：获取File对象表示的是否为一个文件且存在

   - isDirectory()：获取File对象表示的是否为一个目录且存在

   - listFiles()：获取一个目录中的所有子项

     ```java
     public class ListFilesDemo {
         public static void main(String[] args) {
             File dir = new File("."); //"."表示当前目录(当前项目路径)
             /*
               boolean isFile()
               判断当前file对象表示的是否为一个文件且已存在
               boolean isDirectory()
               判断当前File对象表示的是否为一个目录且已存在
              */
             if(dir.isDirectory()){
                 File[] subs = dir.listFiles(); //获取当前目录下的所有子项
                 System.out.println("当前项目目录下共有"+subs.length+"个子项");
                 for(File sub : subs){
                     System.out.println(sub.getName()); //输出每个子项的名称
                 }
             }
         }
     }
     public class ListFilesDemo2 {
         public static void main(String[] args) {
             //仅获取当前项目目录下的所有文本文件(文件名以".txt"结尾)
             File dir = new File(".");
             if(dir.isDirectory()){ //如果是一个目录
                 FileFilter filter = new FileFilter() {
                     //重写accept方法就是定义过滤器的接收条件
                     //重写原则:当参数file对象是该过滤器接收的元素时返回true，否则返回false
                     public boolean accept(File file) {
                         String name = file.getName();
                         return name.endsWith(".txt"); //判断是否是以".txt"结尾
                     }
                 };
     
                 //返回目录中所有满足过滤器要求的子项
                 File[] subs = dir.listFiles(filter);
                 for(File sub : subs){
                     System.out.println(sub.getName());
                 }
             }
         }
     }
     public class ListFilesDemo3 {
         public static void main(String[] args) {
             File dir = new File(".");
             if(dir.isDirectory()){
                 File[] subs = dir.listFiles(file -> file.getName().endsWith(".txt"));
                 for(File sub : subs){
                     System.out.println(sub.getName());
                 }
             }
         }
     }
     ```

     

## 补充：

1. 明日单词：

   ```java
   1)stream：流
   2)input：输入
   3)output：输出
   4)write：写
   5)read：读
   6)close：关闭
   7)copy：拷贝，复制
   ```



## 作业：

1. Test01.java：在当前项目目录下新建100个文件，名字为:"1.txt"---"100.txt"
2. Test02.java：将当前项目目录下1.txt-100.txt文件删除
3. Test03.java：要求用户在控制台输入一个目录名，然后将这个目录创建在当前项目目录下
4. Test04.java：要求用在控制台输入一个目录名，然后将当前项目目录下的这个目录删除。（只要求删除Test03创建的空目录）
5. Test05.java：程序启动后，要求用户输入一个文件名，如果文件存在则提示并要求用户更换，直到该文件还不存在为止，然后将这个文件在当前目录中创建出来。
6. Test06.java：列出当前目录中所有名字包含s的子项。要求：使用匿名内部类和lambda两种写法