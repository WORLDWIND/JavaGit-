package OOPDay05;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  11:08
 **/
public class FinalDemo {

}
class Eoo{
    //演示final修饰变量
    final int num = 5;
    void show(){
        //num = 55; 编译错误 final不能更改
    }
}
//演示final修饰方法
class Foo{
    final void show(){

    }
    void test(){

    }
}
class Goo extends Foo{
    //不能重写show方法,用final修饰
    @Override
    void test() {
        super.test();
    }
}

//final修饰类
final class Hoo{

}
/* 编译错误,final不能被继承
class Ioo extends  Hoo{

}*/
class Hoo1{

}
final class Koo extends Hoo1{//final可以当儿子,不可以当父亲,可以继承自别人,不能让别人继承自己,

}