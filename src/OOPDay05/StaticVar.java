package OOPDay05;

/**
 *  静态变量的演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  11:42
 **/
public class StaticVar {
    int a;//实例变量
    static int b;//静态变量
    StaticVar(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a = " + a + ", b = " + b);
    }
}
