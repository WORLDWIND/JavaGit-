package Day05.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/16  18:31
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = new int[3];
        int[] arr2 = new int[]{1,2,3};

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*100 + 1);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
