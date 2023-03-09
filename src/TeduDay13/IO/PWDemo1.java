package TeduDay13.IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  10:23
 **/
public class PWDemo1 {
    public static void main(String[] args) throws Exception {
        //文件流(字节流,低级流):将字节写入到文件中
        FileOutputStream fos = new FileOutputStream("test1/pw.txt");
        //转换流(字符流,高级流):负责衔接字符流和字节流
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲字符流(字符流,高级流):块文本数据读写加速(内部缓冲区默认8192个char)
        BufferedWriter bw = new BufferedWriter(osw);
        //PrintWriter(字符流,高级流):1.按行写出字符串
        //构造器的第一个参数为流,第二个参数可以传入boolean类型的数据来表示是否打开自动刷新功能(flush),不传入流不能用自动刷新,没有字符串加boolean类型的方法
        PrintWriter pw = new PrintWriter(bw, true);
        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine().trim();
            if (line.equals("exit")) break;
            pw.println(line);
        }
        scan.close();
        pw.close();

        FileInputStream fis = new FileInputStream("test1/pw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        int d;
        while ((d = br.read()) != -1) {
            System.out.print((char) d);
        }
        br.close();

        /*PrintWriter pw1 = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("test1/pw.txt"),StandardCharsets.UTF_8
                        )
                ),true
        );
        pw1.println("起飞");
        pw1.close();*/

        /*PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("test1/pw.txt"), StandardCharsets.UTF_8)
                )
                , true);
        pw.write("你");
        pw.close();*/
    }
}
