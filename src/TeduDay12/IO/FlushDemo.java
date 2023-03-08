package TeduDay12.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  11:34
 **/
public class FlushDemo {
    public static void main(String[] args) throws Exception{
        /*
        通过缓冲流写出的数据会被临时存入缓冲流内部的字节数组中
        知道数组存满数据时,才会真实的写出一次
        通过缓冲输出流 flush() 方法会强制将缓冲流中已经缓冲的数据,一次性写出

        flush()方法是在接口Flushable中定义的
        而字节输出的流的超类OutputStream实现了该接口,这意味着所有字节输出流都是具有该方法的
        但是只有缓冲流真正实现了flush()应有的功能
        其他高级流flush()方法都是调用其连接的流的flush(),将该动作传递下去
         */
        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "我在成都的街头走一走";
        bos.write(line.getBytes(StandardCharsets.UTF_8));
        bos.flush();//冲水
        bos.close();//缓冲流close()会自动调用一次flush()确保所有数据关闭前写出
    }
}
