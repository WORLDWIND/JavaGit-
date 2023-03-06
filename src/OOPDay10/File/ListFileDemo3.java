package OOPDay10.File;

import java.io.File;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  17:23
 **/
public class ListFileDemo3 {
    public static void main(String[] args) {
        File dir = new File("./test");
        if(dir.isDirectory()){
            File[] files = dir.listFiles(file -> {
                return file.getName().endsWith(".txt");
            });
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
