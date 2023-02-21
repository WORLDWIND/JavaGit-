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
    }
}
