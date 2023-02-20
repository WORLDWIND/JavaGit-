package Day06;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  10:16
 **/
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("最大值为:"+arr[arr.length - 1]);
        int max = arr[arr.length - 1];
        arr = Arrays.copyOf(arr,arr.length + 1);
        arr[arr.length - 1] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*Method m = new Method(66,88);
        System.out.println(m.getAge());
        System.out.println(m.getName());*/
    }
}
//Bean类
class Method{
   private int name;
   private int age;
   Method(int name,int age){
       this.name = name;
       this.age = age;
   }

    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}