package Day08.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/20  19:13
 **/

import java.util.Scanner;

/**
 * 需求：
 * 机票价格按照淡季旺季、头等舱、商务舱和经济舱收费，
 * 输入机票原价、月份和头等舱、商务舱或经济舱，
 * 其中旺季（5-10月）头等舱9折，商务舱85折，经济舱8折，
 * 淡季（11月到来年4月）头等舱7折，商务舱65折，经济舱6折，
 * 最终输出机票价格
 */
public class CalAirPrice {
    public static void main(String[] args) {
        //TODO 机票价格
        int mouth = 0, type = 0;
        double price = 0.0;
        boolean result = true;
        while (result) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入月份:");
            mouth = scanner.nextInt();
            System.out.println("请输入机票类型 1.头等舱 2.商务舱 3.经济舱");
            type = scanner.nextInt();
            System.out.println("请输入机票价格");
            price = scanner.nextDouble();
            if (finalFrice(price, mouth, type) != -1) {
                result = false;
            }
            System.out.println("您输入的信息有误");
        }
        System.out.println("最终的机票价格是:" + finalFrice(price, mouth, type));

    }

    //计算飞机票价格 type 1头等舱 2商务仓 3经济仓  mouth 5~10旺季季 11~4淡季
    public static double finalFrice(double price, int mouth, int type) {
        if (mouth > 12 || mouth < 1) return -1;
        if (type > 3 || type < 1) return -1;
        if (mouth >= 5 && mouth <= 10) {
            switch (type) {
                case 1:
                    price *= 0.9;
                    break;
                case 2:
                    price *= 0.85;
                    break;
                case 3:
                    price *= 0.8;
                    break;
            }
        } else {
            switch (type) {
                case 1:
                    price *= 0.7;
                    break;
                case 2:
                    price *= 0.65;
                    break;
                case 3:
                    price *= 0.6;
                    break;
            }
        }
        return price;
    }
}
