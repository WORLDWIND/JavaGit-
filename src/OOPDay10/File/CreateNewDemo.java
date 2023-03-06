package OOPDay10.File;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个新文件
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  15:21
 **/
public class CreateNewDemo {
    public static void main(String[] args) throws IOException {
        /*File file = new File("./test.txt");
        //判断当前文件是否存在 存在输出语句,不存在创建文件
        if (file.exists()) System.out.println("文件已经存在");
        else file.createNewFile();*/
        for (int i = 0; i < 10; i++) {
            File file = new File("./test/test"+(i+11)+".txt");
            if (file.exists()) System.out.println(file.getName()+"文件已经存在");
            else {
                file.createNewFile();
                System.out.println(file.getName()+"创建成功");
            }
        }
    }
}
