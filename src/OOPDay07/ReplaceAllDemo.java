package OOPDay07;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/2  09:38
 **/
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "你MD,你TMD的,你真的是狗啊,WQNMD";
        line = line.replaceAll("(MD|TMD|狗|WQNMD)+","*****");
        System.out.println(line);
    }
}
