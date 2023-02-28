package OOPDay06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/28  11:42
 **/
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        String upper = str.toUpperCase();//将str中的英文字母全部转换为大写,并赋值给upper
        System.out.println(upper);//我爱JAVA
        String lower = str.toLowerCase();
        System.out.println(lower);//将str中的英文字母全部转换为小写,并赋值给lower 我爱java
    }
}
