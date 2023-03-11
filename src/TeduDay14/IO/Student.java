package TeduDay14.IO;

import java.util.Objects;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/11  09:50
 **/
public class Student {
    private String name;
    private int age;
    private String stuId;
    Student(){

    }

    public Student(String name, int age, String stuId) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        /*
        当使用throw抛出一个检查异常时,必须在当前方法上用throws声明该异常的抛出
         */
        if(age<=0||age>100) throw new IllegalAgeException("年龄不合法");
        this.age = age;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(stuId, student.stuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, stuId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stuId='" + stuId + '\'' +
                '}';
    }
}
