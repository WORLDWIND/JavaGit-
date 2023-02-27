package OOPDay05;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  10:46
 **/
public class Student {
    private String name;
    private int age;
    private String address;

    static String className;
    static{
        className = "JSD2023";
        //读取音频,读取视频,读取图片等操作
    }
    //快捷使用getter和setter Alt+insert
    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
