package OOPDay09;

import java.util.*;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/4  17:52
 **/
public class SortInteger {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("List原石数据:" + list);
        Collections.sort(list);//自然排序 从小到大
        System.out.println("list调整以后的数据:" + list);
        Collections.reverse(list);//反转 (数据已经改变了) 不会排序
        System.out.println("list反转以后的数据" + list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(100);
        list1.add(70);
        list1.add(60);
        list1.add(80);
        System.out.println("list1的数据:" + list1);
        Collections.reverse(list1);
        System.out.println("list1反转之后的数据:" + list1);
    }
}
