package OOPDay08.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection接口的演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/3  09:10
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        //TODO 有序 可重复 根据添加的顺序进行存储 可以有重复的项
        Collection c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("aaa");
        System.out.println(c);
        //TODO 无序 不可重复 不按照添加的顺序进行存储 不可以有重复的项
        Collection c1 = new HashSet();
        c1.add("aaa");
        c1.add("bbb");
        c1.add("ccc");
        System.out.println(c1.add("aaa"));//false add()有返回值 boolean类型,添加成功用true 失败用false
        System.out.println(c1);

        Collection c2 = new ArrayList();
        c2.add("one");
        c2.add("two");
        c2.add("three");
        c2.add("four");
        c2.add("five");
        // TODO 重写了toString()方法,不在输出为一串地址
        System.out.println(c2);
        System.out.println("size:" + c2.size());//返回int类型 输出集合元素的个数
        //isEmpty()判断集合是否为空集(size()为0表示为空集)
        System.out.println("是否为空集:" + c2.isEmpty());
        c.clear();//清空集合
        System.out.println("集合已清空:"+c);
        System.out.println("集合的size:"+c.size());
        System.out.println("是否为空集:" + c.isEmpty());

    }
}
