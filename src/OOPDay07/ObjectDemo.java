package OOPDay07;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/2  11:08
 **/
public class ObjectDemo {
    public static void main(String[] args) {
        Point point = new Point(100,200);
        System.out.println(point);

        Point point1 = new Point(1000,2000);
        Point point2 = new Point(1000,2000);
        // TODO 调用Object类的equals(),内部还是在使用==比较地址,没有意义 因此常常需要被重写equals()
        System.out.println(point1.equals(point2));//true
        System.out.println(point1 == point2);//false
        System.out.println(point1.equals("Hello.txt"));

    }
}
