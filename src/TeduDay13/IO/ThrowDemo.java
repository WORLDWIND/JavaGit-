package TeduDay13.IO;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  17:08
 **/
public class ThrowDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        try {
            stu.setAge(1000);
            System.out.println("此人的年龄为" + stu.getAge());
        } catch (RuntimeException e) {
            System.out.println("输入年龄非法");
        }
    }
}
