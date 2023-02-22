package OOPDay02.Test;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  15:59
 **/
public class Fish extends Animal{
    Fish(){
        super();
    }
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    void Eat(){
        System.out.println(name + "正在吃鱼饵");
    }
}
