package OOPDay04;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  14:08
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
    void eat(){
        System.out.println(name + "正在吃饭");
    }
    void sleep(){
        System.out.println(name + "正在睡觉");
    }

    public void getAge() {
        System.out.println(name + "今年" + age + "岁了");
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

interface Swim{
    void swim();
}

class Dog extends Animal implements Swim{
    Dog(){

    }
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    @Override
    public void swim() {
        System.out.println(name+"正在游泳");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Chick extends Animal{
    Chick(){

    }
    Chick(String name,int age,String color){
        super(name,age,color);
    }
}

class Fish extends Animal implements Swim{
    Fish(){

    }
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    @Override
    public void swim() {
        System.out.println(name + "在游泳");
    }
}