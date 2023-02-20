package Day05.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  19:59
 **/
public class test {
    public static void main(String[] args) {
        //利用for循环计算：求数字1到100之内，所有偶数的和，并输出
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if(i%2==0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
        System.out.println(mul(3));
    }
    public static int mul(int a){
        if(a == 1) return 1;
        return a*mul(a-1);
    }
}
