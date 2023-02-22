package OOPDay02.Test;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  15:53
 **/
public class Animal {
    String name;
    int age;
    String color;
    Animal(){

    }
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void Drink(){
        System.out.println(name+"正在喝水");
    }
    void Eat(){
        System.out.println(name+"正在吃饭");
    }
}
