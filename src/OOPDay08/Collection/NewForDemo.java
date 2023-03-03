package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  14:39
 **/
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for (String s : array) {
            System.out.println(s);
        }

        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator i = c.iterator();
        while(i.hasNext()){
            String str = (String) i.next();
            System.out.println(str);
        }
/**
 * 可以装不同类的东西
 */
        Collection c1 = new ArrayList();
        c1.add(100);
        c1.add(18.18);
        c1.add(new Point(1,2));
        System.out.println(c1);
        /**
         * 泛型
         */
        Collection<String> c2 = new ArrayList<>();
        c2.add("123");
        c2.add("java");
        c2.add("php");
        System.out.println(c2);
        Iterator<String> i1 = c2.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
