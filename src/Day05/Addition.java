package Day05;

import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.Li
 * @create: 2023/2/16  09:29
 **/
public class Addition {
    public static void main(String[] args) {
        //TODO 随机Java运算器
//        System.out.println("开始答题每题一分,总分十分,请开始作答");
//        int score = 0;
//        for (int i = 0; i < 3; i++) {
//            int a = (int) (Math.random() * 100 + 1);
//            int b = (int) (Math.random() * 100 + 1);
//            System.out.println("第" + (i + 1) + "题为: " + a + "+" + b + "=" + "?");
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请输入第" + (i + 1) + "你的答案");
//            int answer = scanner.nextInt();
//            if (answer == a + b) score++;
//        }
//        System.out.println("恭喜你完成答题,总分为" + score);
        // TODO Java计算器的接口实现
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入你的一个数据");
        int a = scanner.nextInt();
        System.out.println("请开始输入你的第二个数据");
        int b = scanner.nextInt();
        System.out.println("请输入你要运算的方法");
        String sym = scanner.next();
        selectOper so = new selectOper(sym);
        Computer c = so.select();
        System.out.println("最后的答案为:"+c.test(a,b));
    }
}

interface Computer{
    public abstract String test(int a,int b);
}
class sum implements Computer{
    @Override
    public String test(int a, int b) {
        return a+b+"";
    }
}
class min implements Computer{
    @Override
    public String test(int a, int b) {
        return a - b + "";
    }
}
class div implements Computer{
    @Override
    public String test(int a, int b) {
        if(b == 0) return "TMD 上没上过小学,除数不能为0";
        return a / b + "";
    }
}
class mult implements Computer{
    @Override
    public String test(int a, int b) {
        return a * b + "";
    }
}
class Error implements Computer{
    @Override
    public String test(int a, int b) {
        return "输入的运算符没有被支持";
    }
}
class selectOper{
    String a;
    selectOper(String a){
        this.a = a;
    }
    Computer computer = null;
    public Computer select(){
        switch (a){
            case "+":
                computer = new sum();
                break;
            case "-":
                computer = new min();
                break;
            case "*":
                computer = new mult();
                break;
            case "/":
                computer = new div();
                break;
            default:
                computer = new Error();
        }
        return computer;
    }
}