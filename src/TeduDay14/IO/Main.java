package TeduDay14.IO;

/**
 * 牛逼题
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/11  16:01
 **/
public class Main {
    public static void main(String[] args) {
        Super sup = new Sub();
        sup.m1();
        sup.m2();
        Sub sub = (Sub) sup;
        sub.m1();
        sub.m2();
    }
}
class Super{
    public static void m1(){
        System.out.println("m1 in Super");
    }
    public void m2(){
        System.out.println("m2 in Super");
    }
}
class Sub extends Super{
    public static void m1(){
        System.out.println("m1 in Sub");
    }
    public void m2(){
        System.out.println("m2 in Sub");
    }
}
