package OOPDay04;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  14:16
 **/
public class AnimalTest {
    public static void main(String[] args) {
       /* Chick chick = new Chick("小黄",1,"黄色");
        Fish fish = new Fish("小林",2,"银色");
        Dog dog = new Dog("大黄",3,"黄色");
        chick.eat();
        chick.sleep();
        fish.eat();
        fish.sleep();
        fish.swim();
        dog.eat();
        dog.sleep();
        dog.swim();*/

        Animal[] a = new Animal[5];
        a[0] = new Dog("小黑",1,"黑");
        a[1] = new Dog("小白",1,"白");
        a[2] = new Chick("小金",1,"金");
        a[3] = new Chick("小红",1,"红");
        a[4] = new Fish("小银",1,"银");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
        }
        Dog dog = new Dog("小黑",2,"黑");
        System.out.println(dog.toString());
    }
}
