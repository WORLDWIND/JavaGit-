package Day05;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  16:00
 **/
public class MaxOfArray {
    //TODO 找数组中最大值
    public static void main(String[] args) {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个数据:" + arr[i]);
        }
//        int a = arr[1];
//        int b = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > a) {
//                a = arr[i];
//            }
//            if (arr[i] == 100) b = i;
//        }
//        System.out.println("最大值为:" + a);
//        System.out.println("100为第" + (b + 1) + "个元素");
        //TODO 数组的排序
        Arrays.sort(arr);//对arr进行升序排列 可以将输出变为倒叙
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print("[" + arr[i] + "]");
        }
    }
}
