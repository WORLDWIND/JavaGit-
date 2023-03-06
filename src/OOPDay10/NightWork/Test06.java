package OOPDay10.NightWork;

import java.io.File;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  18:02
 **/
public class Test06 {
    public static void main(String[] args) {
        //TODO 运用匿名内部类和lambda表达式所写
        File dir = new File("./test1");
        File[] files = dir.listFiles(file -> {
            //return file.getName().matches(".*s.*");
            return file.getName().contains("s");
        });
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.println("完事啦");
    }
}
