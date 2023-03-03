package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  15:16
 **/
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        String[] str = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(str));
    }
}
