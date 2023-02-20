package Day05.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  18:29
 **/
public class MultiTable {
    public static void main(String[] args) {
        //九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
