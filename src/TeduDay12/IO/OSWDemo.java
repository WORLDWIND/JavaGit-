package TeduDay12.IO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 转换流:InputStreamRead和OutputStreamWriter 继承自:Reader和Writer
 * 转换流是非常常用的字符流实现类,但实际开发中我们不会直接操作这两个流
 * 但是他们在流连接中是非常重要的一环
 *
 * 在流连接的意义:
 * 由于其他的字符流在流连接中要求只能连接在其他的字符流上,而不能直接连接在字节流上
 * 原因:字符流是以字符为单位,字节流是以字节为单位,读写单位不同,因此不能直接串联在一起工作
 * 转换流是一对字符流,并且是唯一的一个可以直接连接在字节流上的字符流,因此其他的字符流都只能连接在转换流上,而转换流在连接在字节流上,实现串联起读写
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  16:33
 **/
public class OSWDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos  = new FileOutputStream("OSW.txt");
        //创建转换流时,通常会指定第二个参数来明确字符集,以此来保证跨平台性
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("心在跳是爱情如烈火\n" +
                "你在笑疯狂的人是我\n" +
                "爱如火会温暖了心窝\n" +
                "我看见爱的火焰闪烁");
        osw.close();
        System.out.println("写入完毕");
    }
}
