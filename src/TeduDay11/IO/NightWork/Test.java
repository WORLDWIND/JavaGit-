package TeduDay11.IO.NightWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/7  20:49
 **/
public class Test {
    public static void main(String[] args) {
        Aoo aoo = new Aoo();
        aoo.a = 10;
        Aoo boo = aoo;
        boo.a = 100;
        System.out.println(aoo.a);//100

        int a = 1000;
        int b = a;
        b = 10000;
        System.out.println(a);//1000
    }
}
class Aoo{
    int a;
}
interface a {
    public void fun();
    void fun1();
}
enum hello{

}