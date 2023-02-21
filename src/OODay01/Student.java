package OODay01;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/21  10:41
 **/
//TODO 学生类
public class Student {
    /**成员变量*/
    private String name;
    int age;
    String className;
    String stuId;
    //对于新没有直接赋值的初始值,给个默认值
    Student(){
        this("无名氏",0,"未知","未知");
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
        className = null;
        stuId = null;
    }
    /**构造方法*/
                    /**局部变量:写在方法里的方法是局部连变量*/
    Student(String name,int age,String className,String stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }
    /**方法*/
    void study(){
        System.out.println(name+"在学习...");
    }
    void sayHi(){
        System.out.println("大家好,我叫:"+ name+",今年:"+age+"岁了,所在班级为:"+className+",学号是:"+stuId);
    }
    //this只能在方法里用
    void playWith(String name){
        System.out.println(this.name+"在和"+name+"一起玩");
    }

    public String getName() {
        return name;
    }
}
