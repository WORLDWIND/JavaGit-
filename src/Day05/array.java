package Day05;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  14:34
 **/
public class array {
    public static void main(String[] args) {
        //TODO 数组的操作
//        int[] arr = new int[3];
//        int[] arr1 = {1,2,3};
//        int[] arr2 = new int[]{1,2,3};
//
//        int[] arr4 = new int[3];
//        int[] arr5 = {1,2,3};
//        int[] arr6 = new int[]{1,2,3};
//        int[] arr = new int[3];
//        arr[1] = 100;
//        System.out.println(arr[1]);

//        int[] arr = new int[3];
//        System.out.println("数组的长度:"+arr.length);
//        System.out.println(arr[0]);
//        arr[0] = 100;
//        arr[1] = 100;
//        arr[2] = 100;
//        //arr[3] = 400;
//        System.out.println(arr[arr.length - 1]);

        //TODO 数组的遍历:从头到尾挨个走一遍
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+i+"个数据:"+arr[i]);
        }

    }
}
