package TeduDay13.IO;

/**
 * 测试异常的抛出
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  17:06
 **/
public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>100) {
            throw new RuntimeException();
        }
        this.age = age;
    }
}
