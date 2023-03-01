package string;

/**
 * 标准的JavaBean要求
 * 1.成员变量都是私有的
 * 2.提供对应的getter和setter
 * 3.必须提供一个无参的构造方法
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  15:19
 **/
public class Point {
    private String name;
    private int age;
    private String stuId;
    private int x;
    private int y;
    Point(){

    }
    public Point(String name, int age, String stuId) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
    }

    public Point(String name, int age, String stuId, int x, int y) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
}
