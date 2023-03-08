package TeduDay12.NightWork;

import java.io.*;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  17:43
 **/
public class CopyDemo3 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.png");
        FileInputStream fis = new FileInputStream("test.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] data = new byte[(int) file.length()];
        bis.read(data);
        FileOutputStream fos = new FileOutputStream("test01.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(data);
        bos.close();
        bis.close();
    }
}
