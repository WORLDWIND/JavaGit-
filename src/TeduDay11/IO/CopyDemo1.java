package TeduDay11.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 通过提高每次读写的数据量,减少读取次数
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  15:20
 **/
public class CopyDemo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("test.png");
        FileOutputStream fos = new FileOutputStream("Hello.png");
        byte[] data = new byte[1024*10];//10KB
        long start = System.currentTimeMillis();
        int len;
        while ((len = fis.read(data)) != -1) {//一次读入10KB
            //将字节数组从下标0开始连续len个字节写出
            fos.write(data,0,len);//一次写入10KB
        }
        long end = System.currentTimeMillis();
        System.out.println("真牛逼,复制完事了,共用时:" + (end - start) + "ms");
        fis.close();
        fos.close();
        System.out.println("github还是失败了");
    }
}
