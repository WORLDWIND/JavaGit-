package Day05;

/**
 * @program: Tedu
 * @author: Mr.Li
 * @create: 2023/2/16  11:12
 **/
public class MultiTable {
    public static void main(String[] args) {
        //TODO 九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10 - i ; j++) {
                System.out.print(i + "*" + j + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
