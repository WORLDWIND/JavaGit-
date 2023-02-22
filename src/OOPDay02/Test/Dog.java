package OOPDay02.Test;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  15:55
 **/
public class Dog extends Animal{
    Dog(){

    }
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void Housekeeping(){
        System.out.println(name + "正在看家");
    }
    void Eat(){
        System.out.println(name+"再吃骨头");
    }
}
