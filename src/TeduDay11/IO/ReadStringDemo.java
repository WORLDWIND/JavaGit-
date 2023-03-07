package TeduDay11.IO;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  17:03
 **/
public class ReadStringDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("fos.txt");
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[(int)file.length()];//创建与文件等长的字节数组
        fis.read(data);//一次性读取数据到data中
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
        fis.close();
    }
}
