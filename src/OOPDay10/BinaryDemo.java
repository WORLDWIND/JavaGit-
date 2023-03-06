package OOPDay10;

/**
 * 二进制的演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  09:16
 **/
public class BinaryDemo {
    public static void main(String[] args) {
        /*
        1)编译器在编译时会将10进制转变为二进制,然后按照二进制来运算
        .java(45) --- 编译后 ----- .class(101101)
        2)int类型是 32为 4字节 显示二进制自动省略高位0
        3)Integer.toBinaryString()可以将底层2进制数返回
        显示二进制System.out.println(Integer.toBinaryString(n));
        显示十进制:System.out.println(n);
         */
        int n = 45;
        System.out.println(Integer.toBinaryString(n));//二进制输出
        System.out.println(n);//十进制输出

        n++;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n);


    }
}
