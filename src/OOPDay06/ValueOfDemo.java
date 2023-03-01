package OOPDay06;

/**
 * static 静态方法 String valueOf(数据类型 a);
 * 将其他数据类型转换为String
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  13:10
 **/
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);//将int变量a转换为String类型并赋值给s1
        System.out.println(s1);//---字符串类型

        double b = 123.123;
        String s2 = String.valueOf(b);//将double变量b转换为String类型并赋值给s2
        System.out.println(s2);//---字符串类型

        boolean c = 1 < 2;
        String s3 = String.valueOf(c);//将boolean类型变量c转换为String类型并赋值给s3
        System.out.println(s3);//true

        System.out.println(s2 + s1);//123.123123   验证字符串,字符串的拼接
    }
}
