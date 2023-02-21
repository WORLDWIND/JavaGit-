package OODay01;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/21  15:42
 **/
public class ConsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("wangwu",19);
        Student student2 = new Student("zhaoliu",19,"JSD2302","A13190037");
        student.sayHi();
        student.study();
        student.playWith(student1.getName());
        student1.sayHi();
        student1.study();
        student1.playWith(student1.getName());
        student2.sayHi();
        student2.study();
        student2.playWith(student1.getName());

    }
}
