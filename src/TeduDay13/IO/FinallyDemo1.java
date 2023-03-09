package TeduDay13.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常机制在IO操作中的作用
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  16:05
 **/
public class FinallyDemo1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("test1/test/pwp.txt");
        } catch (IOException e) {
            System.out.println("出现IO异常并解决");
        }finally {
            try {
                fos.close();
            } catch (Exception e) {
                System.out.println("关闭字符流输出的异常");
            }
        }
        System.out.println("程序执行结束");
    }
}
