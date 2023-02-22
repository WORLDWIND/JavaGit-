package OOPDay02;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/22  10:14
 **/
public class ExtendsTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("liyuhang",40,"jindimingyue","zhuren");
        doctor.cut();
        doctor.sayHi();
        Student student = new Student("liyuhang",18,"dongbeinongyedaxue","JSD2302","A13190037");
        student.study();
        student.sayHi();
        Teacher teacher = new Teacher("liyuhang",28,"dongbeinongyedaxue",20000);
        teacher.teach();
        teacher.sayHi();
        System.out.println("test");
    }
}
