package OOPDay06;

/**
 * int length()
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/28  11:06
 **/
public class LengthDemo {
    public static void main(String[] args) {
        String str = "我爱Java!";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        System.out.println(str.length());//获取str的长度
    }
}
