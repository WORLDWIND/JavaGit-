package TeduDay12.IO;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 使用转换流读取
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  17:06
 **/
public class ISRDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("OSW.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d;
        while((d = isr.read()) != -1){
            System.out.print((char)d);
        }
        /*int d = isr.read();
        System.out.println((char) d);//心*/
        isr.close();
    }
}
