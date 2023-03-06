package OOPDay10.NightWork;

import java.io.File;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  18:02
 **/
public class Test06 {
    public static void main(String[] args) {
        File dir = new File("./test1");
        File[] files = dir.listFiles(file -> {
            return file.getName().matches(".*s.*");
        });
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
