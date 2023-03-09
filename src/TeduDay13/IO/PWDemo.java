package TeduDay13.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符流-----最常用的读写字符串流
 * 是一对高级流,并且是字符流
 * 内部维护一个默认8KB长度的char数组,还是以块读写的形式读写字符以提高读写效率
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  09:30
 **/
public class PWDemo {
    public static void main(String[] args) throws Exception{
        /*FileOutputStream fos = new FileOutputStream("Tedu.txt");//低级流
        BufferedOutputStream bos = new BufferedOutputStream(fos);//高级流
        OutputStreamWriter osw = new OutputStreamWriter(bos, StandardCharsets.UTF_8);//高级流
        BufferedWriter bw = new BufferedWriter(osw);//缓冲字符流
        bw.write("今天是愉快的一天,真不错,起飞\n");
        bw.write("嗨嗨嗨,今天是愉快的一天,啦啦啦");
        System.out.println("写出完毕");
        bw.close();*/

        //最常用写入字符串方式
        /*PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("你好");
        pw.println("我是李雨航");
        System.out.println("写出完毕");
        pw.close();*/

        FileOutputStream fos = new FileOutputStream("pw.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(bos, StandardCharsets.UTF_8);
        PrintWriter pw = new PrintWriter(osw);
        pw.println("嗨嗨嗨");
        pw.println("今天我李某,就起飞啦");
        pw.close();


    }
}
