package OOPDay10.File;

import java.io.File;

/**
 * 删除文件或目录
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  16:03
 **/
public class DeleteFileDemo {
    public static void main(String[] args) {
        /*File file = new File("./test/test1.txt");
        if (file.exists()) file.delete();
        else System.out.println("该文件不存在");*/

        File f = new File("./a");
        if (f.exists()) {
            f.delete();//若路径表示的是目录,则要求目录不能再有其他文件或目录,若有,则不能直接删除,只有空目录时才能删除
            System.out.println(f.getName() + "已经删除");
        } else{
            System.out.println(f.getName() + "没有该目录");
        }
    }
}
