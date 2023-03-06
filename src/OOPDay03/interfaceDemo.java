package OOPDay03;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  10:45
 **/
public class interfaceDemo extends Boo implements Inter{
    @Override
    public void show() {
        System.out.println("Hello.txt");
    }

    @Override
    public void test() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        interfaceDemo interfaceDemo = new interfaceDemo();
        interfaceDemo.show();
        interfaceDemo.test();
        Aoo a = new Aoo();
        a.show();
        a.test();
    }
}
interface Inter{//接口里的方法都是抽象公开的
    public abstract void show();//完整的写法
    void test();//默认public abstract
}
abstract class Boo{
    abstract void show();
}
class Aoo extends Boo implements Inter{
    @Override
    public void show() {
        System.out.println("Nice to meet you to die");
    }

    @Override
    public void test() {
        System.out.println("I'm fine thank you , and you ?");
    }
}
//演示接口的多实现
interface Inter2{
    void test2();
}
interface Inter3{
    void test1();
}
class Coo implements Inter2,Inter3{
    @Override
    public void test2() {
        System.out.println("Inter2  中的test");
    }

    @Override
    public void test1() {
        System.out.println("Inter1中的test");
    }
}


