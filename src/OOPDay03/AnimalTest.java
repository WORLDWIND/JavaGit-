package OOPDay03;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  14:16
 **/
public class AnimalTest {
    public static void main(String[] args) {
        Chick chick = new Chick("小黄",1,"黄色");
        Fish fish = new Fish("小林",2,"银色");
        Dog dog = new Dog("大黄",3,"黄色");
        chick.eat();
        chick.sleep();
        fish.eat();
        fish.sleep();
        fish.swim();
        dog.eat();
        dog.sleep();
        dog.swim();
    }
}
