package TeduDay11.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO : Input 和 Output,即输入和输出
 * Java将输入和输出用"流Stream"表达,分为输入和输出流
 * 我们可以将他们想象为链接我们程序和另一个设备之间的"管道",通过他们可以读写设备
 * Java将输入流和输出流定义了两个对象的超类InputStream和OutputStream
 * 1)InputStream:
 *      输入流,方向是从外界到程序的方向,用于读取数据的流,是一个抽象类,定义了读取字节的相关方法
 * 2)OutputStream:
 *      输出流,方向是从程序到外界的方向,用于写出数据的流,是一个抽象类,定义了写出字节的相关方法
 *
 *  文件流:
 *      FileOutputStream和FileInputStream
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  10:25
 **/
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");//自动创建
        /**
         * void write(int d)
         *      通过该输出流想目标位置写出1个字节
         */
        //向fos.dat中写入1个字节
        fos.write(1);
        //向fos.dat中写入了1个字节
        fos.write(2);
        //TODO fos.dat文件内容(长度为2字节)

        FileInputStream fis = new FileInputStream("fos.dat");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println("写出完毕");
        fos.close();//关闭文件流

    }
}
