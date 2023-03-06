package OOPDay10.NightWork;

import java.io.File;
import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  17:54
 **/
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除的文件名");
        String name = scanner.nextLine();
        File file = new File("./"+name);
        if(file.isDirectory()) {
            file.delete();
            System.out.println("删除成功");
        }else {
            System.out.println(file.getName() + "删除失败");
        }
    }
}
