package OOPDay10;

/**
 * 补码演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  11:39
 **/
public class ComplementDemo {
    public static void main(String[] args) {
        //规律数:
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toHexString(max));
        System.out.println(Integer.toHexString(min));
        System.out.println(max);
        System.out.println(min);
    }
}
