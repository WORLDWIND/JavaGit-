package Day08.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/20  19:07
 **/
public class PrimeNumber {
    public static void main(String[] args) {
        //TODO 1~100之间的素数
        int num = (int)(Math.random()*100+1);
        boolean result = true;
        for (int i = 2; i < num/2; i++) {
            if(num%i == 0) {
                System.out.println("不是素数");
                result = false;
            }
            break;
        }
        if(result) System.out.println("是素数");
        System.out.println("num的数位:"+num);
    }
}
