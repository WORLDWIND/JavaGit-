package Day07;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/18  10:52
 **/
public class ArrayPractice03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
        }
        /*for (int i : arr1) {
            System.out.print(i+"\t");
        }*/
        System.out.println(Arrays.toString(arr1));
    }
}
