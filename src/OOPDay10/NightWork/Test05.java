package OOPDay10.NightWork;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  17:58
 **/
public class Test05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        do {
            System.out.println("请输入一个文件名");
            String name = scanner.nextLine();
            File file = new File("./test1/"+name+".txt");
            if(file.exists()) System.out.println("文件已经存在,请重新创建");
            else {
                file.createNewFile();
                System.out.println("文件创建成功");
                result = false;
            }
        }while (result);
    }
}
