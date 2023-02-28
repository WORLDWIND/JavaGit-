package OOPDay06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/28  11:13
 **/
public class TrimDemo {
    public static void main(String[] args) {
        String str = "     hello world       ";
        str = str.trim();//去除前后的空白字符,创建出新的字符串
        System.out.println(str);
    }
}
