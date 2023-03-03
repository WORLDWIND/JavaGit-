package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  09:35
 **/
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,10));
        c.add(new Point(11,12));
        c.add(new Point(13,14));
        System.out.println(c);

        /*
        boolean contains(Object o)
        判断当前集合中是否含有当前元素
        判断依据是用equals方法进行判断,需要重写equals()方法,true为包含,false为不包含
         */
        Point p = new Point(1,2);
        System.out.println("是否包含:"+c.contains(p));//true
        /*
        看的不是对象,看属性,集合中没有对象p,但是可以删除元素相同的项
         */
        System.out.println("是否删除成功"+c.remove(p));//从当前元素中删除当前元素,若有重复元素,就删除一次
        System.out.println(c);

        /**
         * 集合中存放的是元素的引用,加入的就是地址
         */
        Collection cc = new ArrayList();
        Point pp = new Point(1,2);
        cc.add(pp);
        System.out.println("cc:"+cc);//(1,2)
        System.out.println("pp:" + pp);//(1,2)
        pp.setX(100);
        System.out.println("cc:" + cc);//(100,2)
        System.out.println("pp:" + pp);//(100,2)

    }
}
