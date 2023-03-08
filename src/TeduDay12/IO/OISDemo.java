package TeduDay12.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 将字节还原成对象
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  15:13
 **/
public class OISDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("studentInfo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        System.out.println(student);
        ois.close();
    }
}