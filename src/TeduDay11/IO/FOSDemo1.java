package TeduDay11.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 读取文件时,目录必须要存在,不存在报错,存在的话没有文件可以自动创建文件
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  11:09
 **/
public class FOSDemo1 {
    public static void main(String[] args) throws IOException {
        //File file = new File("/abc/test.txt");//系统找不到指定的路径。
        File file = new File("test1/test234");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(1);
        fos.close();
    }
}