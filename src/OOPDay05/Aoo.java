package OOPDay05;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  09:52
 **/
public class Aoo {
    protected int a = 10;
    int b = 10;

    public static void main(String[] args) {
        Aoo aoo = new Aoo();
        System.out.println("a = "+aoo.a);
        System.out.println("b = "+aoo.b);
    }
}
class Boo extends Aoo{
    public static void main(String[] args) {
        Boo boo = new Boo();
        System.out.println("Boo中a = "+boo.a);
        System.out.println("Boo中b = "+boo.b);
    }
}
