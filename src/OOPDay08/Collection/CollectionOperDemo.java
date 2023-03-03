package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合间的操作
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  11:56
 **/
public class CollectionOperDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("java");
        c.add("c++");
        c.add(".net");
        System.out.println("c:"+c);
        Collection c1 = new ArrayList();
        c1.add("android");
        c1.add("ios");
        c1.add("java");
        System.out.println("c1:"+c1);

        c.addAll(c1);
        System.out.println("c:"+c);
        System.out.println("c1:"+c1);

        Iterator iterator = c.iterator();

        Collection c2 = new ArrayList();
        c2.add("java");
        c2.add("android");
        c2.add("php");
        System.out.println("是否全部包含:" + c.containsAll(c2));//false 差php

        //删交集:将c中与c2中共有元素删除,c2不变 c变
        c.removeAll(c2);
        System.out.println("c:"+c);
        System.out.println("c2:"+c2);
    }
}
