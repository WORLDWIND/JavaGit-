package TeduDay11.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  14:29
 **/
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("test.png");
        FileOutputStream fos = new FileOutputStream("HelloWorld.png");
        int d;//记录每次读取到的字节
        long a = System.currentTimeMillis();
        while ((d = (fis.read())) != -1) {//每次循环读取一个字节,判断若不是-1,表示没有读到末尾
            fos.write(d);
        }
        System.out.println("一共用时:" + (((double)System.currentTimeMillis() - (double) a) / 1000) + "s");
        System.out.println("复制完毕!");
        fis.close();
        fos.close();
    }
}
