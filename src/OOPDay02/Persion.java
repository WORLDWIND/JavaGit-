package OOPDay02;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  10:13
 **/
public class Persion {
    String name;
    int age;
    String address;

    Persion() {

    }

    Persion(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void eat() {
        System.out.println(name + "正在吃饭");
    }

    void sleep() {
        System.out.println(name + "正在睡觉");
    }

    void sayHi() {
        System.out.println("大家好,我叫:" + name + ",今年" + age + "岁了,家住:" + address);
    }
}

class Student extends Persion {
    String className;
    String stuId;
    Student() {
        super();
    }

    Student(String name, int age, String address, String className, String stuId) {
        super(name, age, address);
        this.className = className;
        this.stuId = stuId;
    }

    void study() {
        System.out.println(name + "正在学习");
    }

    void sayHi() {
        System.out.println("大家好,我叫:" + name + ",今年" + age + "岁了,家住:" + address + ",我的班级名称是:" + className + "我的学号是:" + stuId);
    }
}

class Teacher extends Persion {
    double salary;

    Teacher() {
        super();
    }

    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    void teach() {
        System.out.println(name + "正在上课");
    }

    void sayHi() {
        System.out.println("大家好,我叫:" + name + ",今年" + age + "岁了,家住:" + address + "我的薪资是:" + salary);
    }
}

class Doctor extends Persion {
    String title;

    Doctor() {
        super();
    }

    Doctor(String name, int age, String address, String title) {
        super(name, age, address);
        this.title = title;
    }

    void cut() {
        System.out.println(name + "正在做手术");
    }
}