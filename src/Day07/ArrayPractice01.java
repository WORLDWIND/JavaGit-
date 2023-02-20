package Day07;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/18  09:39
 **/
public class ArrayPractice01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arrs = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100+1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第一个数组为:"+arr[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = (int)(Math.random()*100+1);
        }
        for (int i = 0; i < arrs.length; i++) {
            System.out.print("第二个数组为:"+arrs[i]+"\t");
        }
        System.out.println();
        arrs = Arrays.copyOf(arrs,arrs.length+3);
        for (int i = 0; i < arrs.length; i++) {
            System.out.print("新的第二个数组为:"+arrs[i]+"\t");
        }
        System.arraycopy(arr,2,arrs,10,3);
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i]+"\t");
        }
    }
}
