package TeduDay11.IO;

import java.io.FileInputStream;

/**
 * 读取一个字节
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  11:35
 **/
public class FISDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("fos.dat");
        System.out.println(fis.read());//读取一个字节
        System.out.println(fis.read());//在读取一个字节
        System.out.println(fis.read());//-1 表示已经读取到文件末尾
        fis.close();
    }
}
