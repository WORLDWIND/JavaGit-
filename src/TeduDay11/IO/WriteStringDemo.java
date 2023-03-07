package TeduDay11.IO;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  16:36
 **/
public class WriteStringDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("fos.txt",true);//true为追加
        String lines = "心在跳是爱情烈如火,你在笑疯狂的人是我";
        //TODO 将lin的内容按照utf-8编码转换为字节数组
        byte[] data = lines.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.write(",爱如火温暖了我心窝".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
