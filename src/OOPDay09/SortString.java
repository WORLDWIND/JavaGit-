package OOPDay09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/4  18:03
 **/
public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        list.add("jerry");
        list.add("black");
        list.add("Kobe");
        System.out.println("list原始数据:" + list);
        //排序按照ASCII码进行排序,首字母一样往后排,以此类推 汉字同理
        Collections.sort(list);
        System.out.println("list排序后的数据:" + list);

        List<String> list1 = new ArrayList<>();
        list1.add("王克晶");
        list1.add("传奇jklghjies");
        list1.add("国斌老师");
        list1.add("雨航老师");
        System.out.println("list1的原始数据"+list1);
        //Collections.sort(list1);
        Collections.sort(list1, new Comparator<String>() {
            /**
             * TODO 前面 - 后面    升序 (按照字符串的长度)
             * TODO 后面 - 前面    降序 (按照字符串的长度)
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return
             */
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("list1的排序后的数据" + list1);
    }
}
