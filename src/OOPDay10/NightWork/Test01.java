package OOPDay10.NightWork;

import java.io.File;
import java.io.IOException;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  17:45
 **/
public class Test01 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            File file = new File("./test1/"+(i+1)+".txt");
            if(file.exists()) System.out.println(file.getName()+"文件已经存在");
            else{
                file.createNewFile();
                System.out.println(file.getName() + "文件已经创建");
            }
        }
    }
}
