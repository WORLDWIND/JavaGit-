package OOPDay10;

import java.io.File;

/**
 * 创建一个目录
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  15:50
 **/
public class MkDirDemo {
    public static void main(String[] args) {
        File file = new File("./a/b/c");
        if(file.exists()){
            System.out.println("该目录已经存在");
        }else {
            //file.mkdir();//创建目录所存在的目录必须存在,若不存在不会报错,但也不会创建
            file.mkdirs();//该方法创建目录的时候回连同将所有不存在的目录一起创建(推荐使用)
            System.out.println("创建成功");
        }
    }
}
