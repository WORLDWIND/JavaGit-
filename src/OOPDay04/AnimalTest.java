package OOPDay04;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  14:16
 **/
public class AnimalTest {

    private static Master master;

    public static void main(String[] args) throws Exception {
        //TODO 演示向上造型的(多态)的第一点应用
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
        // TODO 演示向上造型(多态)的第二点应用
        Animal[] a = new Animal[5];
        a[0] = new Dog("小黑", 1, "黑");
        a[1] = new Dog("小白", 1, "白");
        a[2] = new Chick("小金", 1, "金");
        a[3] = new Chick("小红", 1, "红");
        a[4] = new Fish("小银", 1, "银");
        for (int i = 0; i < a.length; i++) {
            System.out.println("----------");
            //System.out.println(a[i].toString());
            if(a[i] instanceof Dog){
                Dog dog = (Dog) a[i];
                System.out.println(dog.lookHome()+"-----------");
                dog.swim();
            }
            /*if(a[i] instanceof Chick){
                Chick chick = (Chick) a[i];
            }*/
            if(a[i] instanceof Fish){
                Fish fish = (Fish) a[i];
                fish.swim();
            }
            a[i].eat();
            a[i].drink();
            a[i].sleep();
            System.out.println("-------------");
        }
        Dog dog = new Dog("小黑", 2, "黑");
        System.out.println(dog.toString()+"666");

        master = new Master();
        Dog dog1 = new Dog("小白", 1, "白");
        Fish fish = new Fish("小金", 1, "金");
        Chick chick = new Chick("小黄", 1, "黄");
        master.feed(dog1);
        master.feed(fish);
        master.feed(chick);

        master.swim(dog1);
        master.swim(fish);

        Animal animal = new Dog("小黑",1,"黑");
        Dog dog2 = (Dog) animal; // Dog 强转为Animal 强转为父类
        Swim swim = (Swim) animal; // Dog 强转为Swim接口 强转为接口
        System.out.println(dog2.lookHome());
        swim.swim();

        Swim swim1 = dog2;//TODO Dog 可以直接赋值给接口
        swim1.swim();
        System.out.println(animal instanceof Dog);//true
        System.out.println(animal instanceof Swim);//true
        System.out.println(animal instanceof Fish);//false
    }
}
