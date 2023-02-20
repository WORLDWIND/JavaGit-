package Day05.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  21:24
 **/
public class Stars {
    public static void main(String[] args) {
        int h = 50;
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (h*2-1) - (2*i-2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
