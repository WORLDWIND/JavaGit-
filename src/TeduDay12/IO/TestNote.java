package TeduDay12.IO;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 简单记事本工具
 * 要求:
 *      程序启动后将用户在控制台输入的每一行字母都写入到问价note.txt中
 *      当用于单独输入exit时程序退出
 *      注意:写入文件内容不用考虑换行问题
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  09:37
 **/
public class TestNote {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("E:\\桌面文件\\note.md",true);
        while(true){
            System.out.println("请开始写入数据!");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine() + "\n";
            if(line.equals("exit\n")) {
                System.out.println("退出成功");
                break;
            }
            byte[] data = line.getBytes(StandardCharsets.UTF_8);
            fos.write(data);
        }
        fos.close();
    }
}
