package OOPDay05;

/**
 * static演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  11:41
 **/
public class StaticDemo {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();
        StaticVar staticVar2 = new StaticVar();
        staticVar2.show();
        System.out.println(StaticVar.b);

        //构造方法创建一个对象就出现一次,静态代码块是只出现一次
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock staticBlock1 = new StaticBlock();
        StaticBlock staticBlock2 = new StaticBlock();
    }
}
