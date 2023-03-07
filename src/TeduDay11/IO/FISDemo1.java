package TeduDay11.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  14:08
 **/
public class FISDemo1 {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("fos.dat");
        //fos.write(-1);
        fos.write(256);
        FileInputStream fis = new FileInputStream("fos.dat");
        //System.out.println(fis.read());//255 读出来的是低八位,不是-1,只有读到文件最后才是-1
        System.out.println(fis.read());
        fis.close();
        fos.close();*/
        FileOutputStream fos = new FileOutputStream("fos.txt");
        FileInputStream fis = new FileInputStream("fos.txt");
        fos.write(256);
        System.out.println(fis.read());
        fis.close();
        fos.close();

    }
}
