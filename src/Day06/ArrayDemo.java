package Day06;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  09:15
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        //TODO 数组的复制
        /*int[] a = new int[]{10,20,30,40,50,60};
        //int[] b = new int[6];
        //第一种
        //System.arraycopy(a,1,b,1,3);//灵活性更好

        //第二种
        //若目标数组长度>原数组长度,则末尾补默认值
        //若目标数组长度<原数组长度,则末尾的截掉
        a = Arrays.copyOf(a,1);//不灵活
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }*/
        //TODO 数组的扩容
        int[] a = {10, 20, 30, 40, 50, 60};
        a = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
