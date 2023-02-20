package Day06.HomeWork;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  19:05
 **/
public class ArrayHomeWorkTest {
    public static void main(String[] args) {
        int[] arr = createArray(100);
        int max = getMaxOfArray(arr);
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个数为:" + arr[i]);
        }
    }
    public static int[] createArray(int lon){
        int[] arr = new int[lon];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100+1);
        }
        return arr;
    }
    public static int getMaxOfArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
