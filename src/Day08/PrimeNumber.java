package Day08;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/20  14:05
 **/
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 13033;//取余,如果能整除,说明它不是素数
        boolean result = true;
        for (int i = 2; i <= num /2; i++) {//超过一半的数据就没有判断意义了
            if(num%i==0) {
                result = false;
                break;
            }
        }
        if(result) System.out.println("是素数");
        else System.out.println("不是素数");
    }
}
