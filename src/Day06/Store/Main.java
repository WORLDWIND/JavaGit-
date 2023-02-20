package Day06.Store;

import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  14:23
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("欢迎开始购物,我们有水,饮料和零食");
        System.out.println("我们店里现在有优惠,满两件9.5折,满三件9折");
        int num = 0;//商品数目
        Scanner scanner = new Scanner(System.in);
        boolean result = true;//是否继续购买,继续购买为true,不继续购买用false
        double sum = 0;//消费总额
        //开始进行消费
        do {
            System.out.println("请输入你向想要的商品");
            String item = scanner.next();
            Items items = null;//商品的类别
            System.out.println("请输入你要购买几个:");
            int piece = scanner.nextInt();//该类,商品购买多少个
            switch (item) {
                case "水":
                    items = new Water();
                    sum += items.price * piece;
                    System.out.println("您点了水,水的价格为:" + items.price + "您一共点了" + piece + "个水," + "目前的总价为:" + sum);
                    num += piece;
                    break;
                case "饮料":
                    items = new Beverages();
                    sum += items.price * piece;
                    System.out.println("您点了饮料,饮料的价格为:" + items.price + "您一共点了" + piece + "个饮料," + "目前的总价为:" + sum);
                    num += piece;
                    break;
                case "零食":
                    items = new Snacks();
                    sum += items.price * piece;
                    System.out.println("您点了零食,零食的价格为:" + items.price + "您一共点了" + piece + "个零食," + "目前的总价为:" + sum);
                    num += piece;
                    break;
                default:
                    System.out.println("我们的售货机没有该物品,请输入水,饮料和零食");
            }
            System.out.println("您是否还需要购物?输入任意字符继续 不需要输入否");
            String a = scanner.next();
            if (a.equals("否")) result = false;
            else result = true;
        } while (result);
        System.out.println("价格为:" + sum);
        System.out.println("您一共购买了" + num + "个物品");
        if (num < 2) {
            System.out.println("没有优惠");
        } else if (num < 3) {
            sum *= 0.95;
            System.out.println("优惠为9.5折,当前的价格为:" + sum);
        } else {
            sum *= 0.9;
            System.out.println("优惠为9折,当前的价格为:" + sum);
        }
        System.out.println("请开始付款,可以使用微信或者支付宝");
        double money = scanner.nextDouble();
        while (money < sum) {
            System.out.println("钱没给够,请从新付款");
            money = scanner.nextDouble();
        }
        System.out.println("您一共消费了:" + sum + "元" + ",您一共购买了:" + num + "商品");
    }
}
