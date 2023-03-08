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
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        Student student = new Student("zhangsan",22, new String[]{"唱", "跳", "rap", "篮球"},"A13190037");
        oos.writeObject(student);
        oos.close();
        FileInputStream fis = new FileInputStream("OOSOIS.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Student ss = (Student) ois.readObject();
        System.out.println(ss);
        ois.close();
    }
}
