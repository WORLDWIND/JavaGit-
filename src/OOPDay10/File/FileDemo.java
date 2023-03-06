package OOPDay10.File;

import java.io.File;

/**
 * java.io.File:
 * 该类的每一个实例用于表示毅哥文件或目录,但实际上表示一个抽象路径
 * 使用File可以:
 * 1)访问其表示的文件或目录的属性信心(名字,大小,权限等)
 * 2)创建/删除文件或目录
 * 3)访问一个目录的子项信息
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  14:28
 **/
public class FileDemo {
    public static void main(String[] args) {
        //绝对路径 : 从盘符开始不利于跨平台
        //File file = new File("E:\\桌面文件\\平时存放东西的地方\\下载");
        //相对路径 : 相对于某个位置,有利于跨平台
        //常用的相对路径有:"./"表示当前目录,以及后期常用的类加载路径
        //File file1 = new File("./");

        File file = new File("./demo.txt");
        System.out.println(file.getName());//获取file文件或目录名
        //长度为0有两种情况:1.路径无效2确实文件没有内容
        long length = file.length();//获取file表示的文件或目录的长度
        System.out.println(length);
        boolean ih = file.isHidden();
        System.out.println(ih);//false
        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        System.out.println(cr);//true
        System.out.println(cw);//true
    }
}
