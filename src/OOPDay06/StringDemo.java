package OOPDay06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/28  09:44
 **/
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";//创建对象进入常量池
        String s2 = "Hello";
        String s3 = "Hello";
        System.out.println(s1 == s2);//true 进行地址的比对
        System.out.println(s2 == s3);//true
        System.out.println(s1 == s3);//true

        s1 += "!";//创建新的字符串对象,并且不会进入常量池
        String s4 = "Hello!";
        System.out.println(s1 == s2);//false
        System.out.println(s1);
        System.out.println(s1 == s4);//false
        System.out.println(s1.equals(s4));//true

        String s5  = new String("hello");//创建两个对象
        String s6 = "hello";
        System.out.println(s6.equals(s5));//true
        System.out.println(s6 == s5);//false 地址不同
    }
}
