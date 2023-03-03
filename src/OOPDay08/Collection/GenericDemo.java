package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  14:57
 **/
public class GenericDemo {
    public static void main(String[] args) {

        Collection<Point> c1 = new ArrayList<>();
        c1.add(new Point(1,2));
        c1.add(new Point(3,4));
        c1.add(new Point(5,6));

        Iterator<Point> i1 = c1.iterator();
        while (i1.hasNext()) {
            System.out.println("i1的值为:" + i1.next());
        }

        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        //迭代器的泛型应该与其遍历的集合泛型一致
        Iterator<String> i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (String s : c) {
            System.out.println(s);
        }
    }
}
