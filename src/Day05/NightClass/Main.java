package Day05.NightClass;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  19:08
 **/
public class Main {
    public static void main(String[] args) {
        //int a = 4,b = 5;
        //System.out.println(a++ < b-- ? a++ : b--);
//        switch (a){
//            case 4:
//                System.out.println("a");
//            default:
//                System.out.println("b");
//        }
        /*
        小练习
         */
        //int a = (int)(Math.random()*100 + 1);
//        if(0%7==0) System.out.println("a是7的倍数 "+"a为:");
//        else System.out.println("该数字不是7的倍数,为");
        int a = 21;
        //  7的倍数  个位是7  十位是7
        if (a % 2 == 0 || a / 10 == 2) {
            System.out.println("牛逼");
        }
    }
}
