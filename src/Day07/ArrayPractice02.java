package Day07;

import java.util.Scanner;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/18  09:54
 **/

/**
 * 银行存款的代码实现
 */
public class ArrayPractice02 {
    public static void main(String[] args) {
        Bank bank = new Bank() {
            @Override
            public boolean service(double money) {
                return false;
            }
        };
        double balance = 100.0;//余额
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的卡号");
        System.out.println("请输入您的密码");
        boolean result = true;//是否进行退卡,true为不退卡,false是退卡
        do {
            System.out.println("请选择你想要的服务:存款,取款,查询余额,退卡");
            String service = scan.next();
            switch (service){
                case "存款":
                    bank = new Deposit();
                    System.out.println("请输入您要存入的金额");
                    double inMoney = scan.nextDouble();
                    balance += inMoney;
                    System.out.println(bank.service(inMoney));
                    break;
                case "取款":
                    bank = new WithdrawMoney();
                    System.out.println("请输入您要取走的金额");
                    double outMoney = scan.nextDouble();
                    bank.balance = balance;
                    while (!(bank.service(outMoney))){
                        System.out.println(bank.service(outMoney));
                        System.out.println("您取走的金额超过您的存款");
                        System.out.println("是否继续取款?");
                        String a = scan.next();
                        if(a.equals("否")) break;
                        System.out.println("请输入取款金额");
                        outMoney = scan.nextDouble();
                    }
                    if(bank.service(outMoney)) balance -= outMoney;
                    System.out.println(bank.service(outMoney));
                    break;
                case "查询余额":
                    bank.balance = balance;
                    System.out.println("您当前的余额为:"+bank.CheckBalances());
                    break;
                case "退卡":
                    System.out.println("确定执行退卡吗?");
                    String str = scan.next();
                    if(bank.CheckOut(str)){
                        System.out.println("欢迎您的下次光临");
                    }
                    result = false;
                    break;
                default:
                    System.out.println("当前操作错误");
            }
        }while(result);
        bank.balance = balance;
        System.out.println("当前您的余额为:"+bank.balance);
    }
}
abstract class Bank{
    //余额
    double balance;
    public abstract boolean service(double money);
    //查询余额
    public double CheckBalances(){
        return balance;
    }
    //退卡
    public boolean CheckOut(String str){
        if(str.equals("确定")) return true;
        return false;
    }
}
//存款
class Deposit extends Bank{
    @Override
    public boolean service(double money) {
        return true;
    }
}
//取款
class WithdrawMoney extends Bank{
    @Override
    public boolean service(double money) {
        if(balance < money) return false;
        return true;
    }
}

