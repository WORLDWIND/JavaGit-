package OOPDay09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/4  09:45
 **/
public class ListDemo {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();//是一样的 ArrayList相当于数组 易改查,LinkedList相当于链表 易增删
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list:" + list);

        String e = list.get(2);
        System.out.println(e);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");
        for (String s : list) {
            System.out.println(s);
        }
        String old = list.set(2,"six");//将集合下标为2的数据改为six,并且返回原数据
        System.out.println(old);//three
        System.out.println("list:"+list);
        /**
         * void add(int index,E e);
         * 给定元素e添加到index所指定的位置,相当于插入操作
         */
        list.add(3,"seven");
        System.out.println("list:" + list);
    }
}
