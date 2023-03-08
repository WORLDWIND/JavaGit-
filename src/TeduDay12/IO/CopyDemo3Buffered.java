package TeduDay12.IO;

import java.io.*;

/**
 * 缓冲流 : 是一对高级流,作用是加快读写效率
 * 1)BufferedInputStream:缓冲输入流
 * 2)BufferedOutputStream:缓冲输出流
 * 缓冲流读写效率快的原因
 * 1)缓冲流内部有一个8KB的字节数组
 *      看着是一个字节一个字节读写,但是缓冲流底层已经把它转换为块读写
 * 缓冲流何时用才有意义
 * 1)不同的高级流有不同的功能,但只有缓冲流才具有加速功能(块读写)
 *   其他的高级流不具备加速功能,都是单字节读写
 *   此时若又想完成功能又想加速处理,则需要流连接,将功能连接到缓冲流上
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  10:51
 **/
public class CopyDemo3Buffered {
    public static void main(String[] args) throws Exception {
        File file = new File("test.png");
        FileInputStream fis = new FileInputStream("test.png");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("LYH.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        byte[] data = new byte[(int) file.length()];
        //int d;
        /*while ((d = bis.read()) != -1) {//使用缓冲流读取字节 单字节
            bos.write(d);//使用缓冲流写出字节
        }*/
        bis.read(data);//一次性读取
        bos.write(data);
        long end = System.currentTimeMillis();
        System.out.println("复制完毕,耗时:"+(end - start)+"ms");
        //只需要关高级流 自动关闭低级流
        bis.close();
        bos.close();
    }
}
