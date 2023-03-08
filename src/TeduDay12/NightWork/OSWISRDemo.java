package TeduDay12.NightWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  17:52
 **/
public class OSWISRDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("OSWISR.txt");
        FileInputStream fis = new FileInputStream("OSWISR.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
        osw.write("心在跳爱如烈火,你在笑疯狂的是我,爱如火温暖了我心窝");
        osw.close();
        System.out.println("写入完毕");
        int d;
        while ((d = isr.read())!=-1){
            System.out.print((char)d);
        }
        System.out.println("读取完毕");
        isr.close();

    }
}
