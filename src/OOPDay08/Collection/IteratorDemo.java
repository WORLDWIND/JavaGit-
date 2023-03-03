package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  14:00
 **/
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);

        Iterator i = c.iterator();
        while (i.hasNext()){
            String str = (String) i.next();
            System.out.println(str);
            if("#".equals(str)){
                //c.remove(str); 在迭代器运行过程中,不允许变动集合的长度 否则会爆异常
                i.remove();//删除当前遍历出来的元素
            }
        }
        System.out.println(c);
    }
}
