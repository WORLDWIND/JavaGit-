package TeduDay12.NightWork;

import java.io.*;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  17:47
 **/
public class OOSOISDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("OOSOIS.txt");
        FileInputStream fis = new FileInputStream("OOSOIS.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = new Student("zhangsan",22, new String[]{"唱", "跳", "rap", "篮球"},"A13190037");
        oos.writeObject(student);
        Student ss = (Student) ois.readObject();
        System.out.println(ss);
        ois.close();
        oos.close();
    }
}
