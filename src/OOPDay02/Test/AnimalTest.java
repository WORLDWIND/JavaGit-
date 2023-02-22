package OOPDay02.Test;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  16:00
 **/
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小汪",3,"黑色");
        Chick chick = new Chick("小鸡",1,"黄色");
        Fish fish = new Fish("小美",2,"金色");
        dog.Eat();
        chick.Eat();
        fish.Eat();
        dog.Drink();
        chick.Drink();
        fish.Drink();
        dog.Housekeeping();
        chick.Laying();
    }
}
