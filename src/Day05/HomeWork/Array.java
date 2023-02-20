package Day05.HomeWork;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  21:43
 **/
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(arr);
        System.out.println("最小值是: " + arr[0]);
        System.out.println("最大值是: " + arr[arr.length - 1]);
    }
}
