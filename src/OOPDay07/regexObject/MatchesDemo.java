package OOPDay07.regexObject;

/**
 * boolean matches(String regex):匹配
 * 使用给定的正则表达式(regex)验证打钱字符串是否符合要求,若符合返回true,不符合返回false
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/2  09:25
 **/
public class MatchesDemo {
    public static void main(String[] args) {
        /*
        邮箱的正则表达式: [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String email = "liyuhang@qq.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if(match) System.out.println("是正确的邮箱格式");
        else System.out.println("不是正确的邮箱格式");
    }
}
