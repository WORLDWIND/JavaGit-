package Day08.HomeWork;

import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/20  19:33
 **/
public class CalTotalAvg {
    public static void main(String[] args) {
        int[] people = enterData(3);
        int total = calTotal(people);
//        for (int person : people) {
//            System.out.println(person);
//        }
        System.out.println(total);
        System.out.println("平均分为:"+calAvg(people));
    }

    public static int[] enterData(int peopleNum) {
        Scanner scan = new Scanner(System.in);
        int[] score = new int[peopleNum];
        for (int i = 0; i < score.length; i++) {
            System.out.println("第" + (i + 1) + "位选手的分数是");
            score[i] = scan.nextInt();
        }
        return score;
    }

    /*计算总分*/
    public static int calTotal(int[] score) {
        int total = 0;
        int max = score[0];
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
            total += score[i];
        }
        return total - min - max;
    }
    public static int calAvg(int[] score){
        int sum = calTotal(score);
        return sum / (score.length - 2);
    }
}
