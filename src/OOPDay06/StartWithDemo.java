package OOPDay06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/28  11:54
 **/
public class StartWithDemo {
    public static void main(String[] args) {
        String str = "thinking in Java";//变成思想(工具书)
        System.out.println(str.startsWith("t"));//true
        System.out.println(str.startsWith("thinking"));//true
        System.out.println(str.endsWith("java"));//false 严格区分大小写
        System.out.println(str.endsWith("a"));//true
    }
}
