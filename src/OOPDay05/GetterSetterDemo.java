package OOPDay05;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  10:41
 **/
public class GetterSetterDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(100);
        point.setY(200000);
        System.out.println("X = "+point.getX());
        System.out.println("Y = " + point.getY());
    }
}
