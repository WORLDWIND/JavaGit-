package OOPDay07;

/**
 * 包装类演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/2  19:32
 **/
public class IntegerDemo {
    public static void main(String[] args) {
        /*//包装类的定义
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1 == i2);//false ==比较的是地址
        System.out.println(i1.equals(i2));//true Integer里重写了equals方法
        //valueOf会复用1个字节(-128~127)范围内的数据
        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);
        System.out.println(i3 == i4);//true
        System.out.println(i3.equals(i4));//true
        int i = i4.intValue();
        System.out.println(i);*/

       //TODO 触发了自动装箱机制
        Integer i = 5;//Integer i = Integer.valueOf(5); 装箱
        //TODO 触发了自动拆箱的机制
        int j = i;//int j = i.intValue();

    }
}
interface  I{
    public abstract void show();//抽象方法 -- 用的多
    public static final int Num = 5;//常量 -- 用的少
    public default void test(){//默认方法 -- 用的少,1.8加入

    }
    public static void say(){//静态方法--用的少,1.8加入的

    }
   /* private void sayHi(){
        1.8之后的版本
    }*/
}