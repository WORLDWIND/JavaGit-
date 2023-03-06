package OOPDay10.File;

import java.io.File;
import java.io.FileFilter;

/**
 * listFile()方法提供了一个重载,可以传入一个文件的过滤器FileFilter
 * 该方法在获取与一个目录中子项时仅会将所有满足过滤器要求的子项返回
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  16:57
 **/
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //仅获取其当前项目目录下的所有文本文件(.txt类型)
        File dir = new File("./test");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                //重写accept方法就是定义过滤器的接受条件
                //重写原则:当前参数file对象是该过滤器接受的元素时返回true,否则返回false
                @Override
                public boolean accept(File pathname) {
                    String name = pathname.getName();
                    return name.endsWith(".txt");//判断是否以".txt"结尾
                }
            };
            File[] files = dir.listFiles(filter);
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
