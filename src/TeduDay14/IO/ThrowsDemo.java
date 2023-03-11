package TeduDay14.IO;

/**
 * throws的演示
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/11  09:58
 **/
public class ThrowsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        /*
        当调用一个含有throws声明异常抛出的方法时,编译器要求必须处理该异常,处理手段有两种
        1)try catch
        2)throws
        2)一般不在main方法中做throws抛出
         */
        try {
            student.setAge(250);
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("此人的年龄为:"+student.getAge()+"岁");
    }
}
