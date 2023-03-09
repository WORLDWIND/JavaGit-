package TeduDay13.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符的输入流
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  10:55
 **/
public class BRDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("test1/pw.txt");//文件流(字节流,低级流)
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);//转换流(字符流,高级流)
        BufferedReader br = new BufferedReader(isr);//缓冲字符流(字符流,高级流)
        /*
        String readLine();
        读取一行字符串,返回的字符串中不包含最后的换行符
        如果单独读取到换行符(一个空行)则返回值为空字符串("")
         */
        String line ;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
