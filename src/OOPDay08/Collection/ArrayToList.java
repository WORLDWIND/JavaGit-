package OOPDay08.Collection;

import java.util.Arrays;
import java.util.List;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  15:59
 **/
public class ArrayToList {
    public static void main(String[] args) {
        String[]  arr = {"one","two","three","four","five"};
        System.out.println("arr:" + Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);
        System.out.println("list:" + list);
        // TODO 对数组进行操作,会改变集合中的数据
        arr[1] = "six";
        System.out.println("arr:" + Arrays.toString(arr));
        System.out.println("list:" + list);
        //TODO 对集合进行操作,会改变数据中的数据
        list.set(3,"seven");
        System.out.println("arr:" + Arrays.toString(arr));
        System.out.println("list:" + list);
        /**
         * 给集合添加或删除操作就是改变数据中元素的个数
         * 数组不支持自动扩容或缩容,因此会发生操作异常
         */
//        list.add("!!!");//运行时,会发生不支持操作异常
//        System.out.println("arr:" + Arrays.toString(arr));
//        System.out.println("list:" + list);
    }
}
