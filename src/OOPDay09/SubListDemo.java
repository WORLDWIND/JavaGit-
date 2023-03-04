package OOPDay09;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/4  10:38
 **/
public class SubListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        System.out.println("list:" + list);
        List<Integer> subList = list.subList(3, 8);
        System.out.println(subList);//3~7

        //将子集的数据扩大10倍
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println("subList:" + subList);
        System.out.println("list:" + list);//对子集的操作就是对原来集合的操作

        //TODO 原集合数据改变子集跟着改变,只要不修改长度,子集就可以使用
        list.set(3,1000);
        System.out.println("list:"+list);
        System.out.println("subList:" + subList);

        list.remove(0);
        System.out.println("list:"+list);
        //TODO 原集合长度修改之后,子集将不能在进行任何操作了,操作就发生异常,但是可以重新获取子集
        //System.out.println("subList:"+subList); 报错 ConcurrentModificationException
    }
}
