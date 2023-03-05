package OOPDay09;

import java.util.ArrayList;
import java.util.List;

/**
 * Point对象 -- 集合的排序
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/4  18:41
 **/
public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(120, 20));
        list.add(new Point(30, 4));
        list.add(new Point(5, 600));
        list.add(new Point(789, 8));
        list.add(new Point(9000, 10));
        System.out.println("list原始数据" + list);
        /*Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (o1.getX() * o1.getX() + o1.getY() * o1.getY()) - (o2.getX() * o2.getX() + o2.getY() * o2.getY());
            }
        });*/
        //方式一样,但是list更为简单 1.8才有
        /*list.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (o1.getX() * o1.getX() + o1.getY() * o1.getY()) - (o2.getX() * o2.getX() + o2.getY() * o2.getY());
            }
        });*/
        list.sort((o1, o2) -> {
            int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
            int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
            return len1 - len2;
        });
        System.out.println("list排序之后的数据" + list);
    }
}
