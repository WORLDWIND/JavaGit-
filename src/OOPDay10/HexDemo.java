package OOPDay10;

/**
 * 16进制演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/6  10:19
 **/
public class HexDemo {
    public static void main(String[] args) {
        /*
        16进制:重写2进制
        1)0x为16进制字面量前缀
        2)0b为2进制字面量前缀,可以加下划线,一般不用,一般用16进制来缩写
        3)计算机内部没有10进制,也没有16进制,只有2进制
         */
        int n = 0x2fd47b;
        int m = 0b1011111101010001111011;
        //用2进制输出
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        //用十六进制输出
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toHexString(m));
        //按十进制输出
        System.out.println(n);
        System.out.println(m);
        /*
        8进制:
        1)规则:逢8进一
        2)数组:0,1,2,3,4,5,6,7
        3)基数:8
        4)权值:512 64 8 1
         */
        int a = 067;
        System.out.println(a);
        //面试题
        //int b = 068;
        //System.out.println(b);
        //答:编译错误: 因为0开头为8进制最大数字为7
    }
}
