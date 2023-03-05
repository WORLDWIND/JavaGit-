package OOPDay09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/5  19:36
 **/
public class SetDemo {
    public static void main(String[] args) {
        /*Set<String> list = new HashSet<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list原始数据:" + list);
        String[] str = list.toArray(new String[0]);
        for (String s : str) {
            System.out.println(s);
        }*/
        //小面试题:如何去重
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        System.out.println("list原始数据:" + list);
        Set<String> set = new HashSet<>();
        set.addAll(list);//将list集合中的元素都添加到set集合中
        System.out.println("去重后的数据set:" + set);
    }
}
