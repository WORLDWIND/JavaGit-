package TeduDay12.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将所有小写字母写入文件fos.txt中
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  09:15
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        /*char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(97 + i);
        }
        String line = new String(chars);
        FileOutputStream fos = new FileOutputStream("fos.txt");
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.close();*/
        FileOutputStream fos = new FileOutputStream("fos.txt");
        for (int i = 0; i < 26; i++) {
            fos.write(97 + i);
        }
        System.out.println("写出完毕");
        fos.close();
    }
}
