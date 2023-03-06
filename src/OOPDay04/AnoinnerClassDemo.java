package OOPDay04;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/24  15:00
 **/
public class AnoinnerClassDemo {
    public static void main(String[] args) {
        // TODO 创建了一个Aoo的派生类,但是没有名字
        //  为该派生类创建了一个对象,名为o1,向上造型为Aoo类型
        Aoo o = new Aoo() {};
        Aoo o1 = new Boo();
        // 想创建Aoo的派生类对象,并且对象指创建一次---简化代码
        //TODO 大括号中是派生类的类体
        int num = 5;
        Coo coo = new Coo() {//重写Coo中的方法
            @Override
            void show() {
                System.out.println("Hello.txt World");
                a = 10;
            }
            //num = 55; 编译错误,匿名内部类中不能修改外面局部变量的值
        };
        coo.show();//通过派生类对象类调用派生类类体中的show()方法
        System.out.println(coo.a);
    }
}
abstract class Aoo{

}
class Boo extends Aoo{

}
abstract class Coo{
    int a = 20;
    abstract void show();
}
