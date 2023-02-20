package Day05.HomeWork;

import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  18:22
 **/
public class Addition {
    public static void main(String[] args) {
        int score = 0;
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 100 + 1);
            System.out.println("开始答第" + i + "题吧:" + a + "+" + b + "=?");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer != a + b) {
                System.out.println("答错啦");
            }else{
                System.out.println("回答正确");
                score++;
            }
        }
        System.out.println("总分为:"+score);
    }
}
