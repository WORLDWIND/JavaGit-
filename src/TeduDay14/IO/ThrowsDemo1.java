package TeduDay14.IO;

import java.awt.*;
import java.io.IOException;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/11  10:52
 **/
public class ThrowsDemo1 {
    public void dosome() throws IOException, AWTException{}
    int[] arr = {1,2,3};
}
class SubClass extends ThrowsDemo1{
    //可以完全相同,可以不抛,也可以抛一部分,也可以抛出子类型
    //public void dosome(){}
    //public void dosome() throws IOException{}
    //public void dosome() throws FileNotFoundException {}

    //不能抛没有的,不能抛夫类型
    //public void dosome() throws IllegalAgeException{}
    //public void dosome() throws Exception{}
}
class A {
    String s = "123";
    public static void main(String[] args) {
        A a = new A();
        a.abc(a.s);
        System.out.println(a.s);
    }
    void abc(String s){
        s = "456";
    }
}


