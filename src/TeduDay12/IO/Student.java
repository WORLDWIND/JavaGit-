package TeduDay12.IO;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  14:25
 **/
public class Student implements Serializable {
    //私有属性,公开构造,公开getter/setter,重写toString()方法
    private String name;
    private int age;
    private String stuId;
    //transient 当一个属性被transient修饰,当这个对象进行序列化时,此属性会被忽略
    //忽略不必要的属性值,可以达到对象序列化瘦身的目的,以减少磁盘开销或提高网络传输效率
    private transient String[] otherInfo;

    Student() {

    }

    public Student(String name, int age, String stuId, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
        this.otherInfo = otherInfo;
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

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(stuId, student.stuId) && Arrays.equals(otherInfo, student.otherInfo);
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
                ", stuId='" + stuId + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
