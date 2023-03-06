package OOPDay10.File;

import java.io.File;

/**
 * 访问一个目录钟的所有子项
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  16:37
 **/
public class ListFileDemo {
    public static void main(String[] args) {
        /*File file = new File("./test");//"."表示当前目录(当前目录路径)
        //若当前file对象表示的为一个目录并且已经存在
        if (file.isDirectory()) {
            System.out.println("是个目录,并且已经存在");
        } else {
            System.out.println("不是目录,或不存在");
        }
        file = new File("./test/test.txt");
        if (file.isFile()) {
            System.out.println("这是个文件,并且已经存在");
        } else {
            System.out.println("不是文件,或不存在");
        }*/

        File dir = new File("./test");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();//获取大哥前目录下的所有子项目
            System.out.println("当前项目目录下共有" + subs.length + "个子项目");
            for (File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
