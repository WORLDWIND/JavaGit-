package Day05;

import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.Li
 * @create: 2023/2/16  09:09
 **/
public class ForDemo {
    public static void main(String[] args) {
        System.out.println(sum(199));
        //for循环实现累加
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入累加到几次");
        int c = scanner.nextInt();
        int a = 1;
        int sum = 0;
        for (int i = 1; i <= c; i++) {
            sum += a++;
        }

        System.out.println("sum = "+sum);
    }

    //累加
    public static int sum(int a) {
        if (a == 1) return 1;
        return a + sum(a - 1);
    }
}
