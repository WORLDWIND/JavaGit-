package OOPDay10.NightWork;

import java.io.File;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  17:48
 **/
public class Test02 {
    public static void main(String[] args) {
        File dir = new File("./test1");
        File[] subs = dir.listFiles(file -> {
            return file.getName().endsWith(".txt");
        });
        for (File sub : subs) {
            System.out.println(sub.getName());
        }
        for (File sub : subs) {
            sub.delete();
        }
    }
}
