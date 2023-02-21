package OODay01;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/21  10:58
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("lisi",18,"高三六班","A13190037");
        student.sayHi();
        student.study();
        System.out.println(student.toString());
        student.playWith("liming");
        Student student1 = new Student("wangwu",20,"大二","A13190058");
        Student student2 = new Student("zhaoliu",19,"JSD2302","A13190057");
        student1.sayHi();
        student1.study();
        student1.playWith(student2.getName());
        student2.sayHi();
        student2.study();
        student2.playWith(student1.getName());
    }
}
