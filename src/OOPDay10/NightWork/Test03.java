package OOPDay10.NightWork;

import java.io.File;
import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  17:51
 **/
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件名");
        String name = scanner.nextLine();
        File file = new File("./"+name+"");
        if(file.exists()) System.out.println(file.getName()+"该文件夹已经存在");
        else {
            file.mkdirs();
            System.out.println(file.getName()+"创建成功");
        }
    }
}
