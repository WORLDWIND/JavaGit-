package Day05.HomeWork;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  18:33
 **/
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
