package TeduDay12.NightWork;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  17:45
 **/
public class Student implements Serializable {
    private String name;
    private int age;
    private String[] otherInfo;
    private String stuId;
    Student(){

    }

    public Student(String name, int age, String[] otherInfo, String stuId) {
        this.name = name;
        this.age = age;
        this.otherInfo = otherInfo;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
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
        return age == student.age && Objects.equals(name, student.name) && Arrays.equals(otherInfo, student.otherInfo) && Objects.equals(stuId, student.stuId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, stuId);
        result = 31 * result + Arrays.hashCode(otherInfo);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                ", stuId='" + stuId + '\'' +
                '}';
    }
}
