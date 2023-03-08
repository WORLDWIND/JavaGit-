package TeduDay12.NightWork;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  18:00
 **/
public class Read {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("OSWISR.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d;
        while((d = isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
