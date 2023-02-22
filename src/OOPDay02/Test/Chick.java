package OOPDay02.Test;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  15:57
 **/
public class Chick extends Animal{
    Chick(){

    }
    Chick(String name,int age,String color){
        super(name,age,color);
    }
    void Laying(){
        System.out.println(name+"正在下蛋");
    }
    void Eat(){
        System.out.println(name + "正在吃小米");
    }
}
