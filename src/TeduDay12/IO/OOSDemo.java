package TeduDay12.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象流:处理流/高级流
 * 1)ObjectInputStream和ObjectOutputStream
 * 2)作用:进行对象的序列化和反序列化
 * 3)对象序列化:将一个Java对象转换为一组字节的过程称为对象序列化
 *   对象反序列化 :将一组字节还原为Java对象
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  14:22
 **/
public class OOSDemo {
    public static void main(String[] args) throws Exception{
        String name = "张三";
        int age = 25;
        String stuId = "A13190037";
        String[] otherInfo = {"是一名学生","唱","跳","rap","篮球"};
        Student student = new Student(name,age,stuId,otherInfo);
        System.out.println(student);

        /**
         * 对象输出流在序列化对象时需要保证序列化对象必须实现Serializable接口
         * 若没有实现接口会发生 NotSerializableException 没有序列化的异常
         */
        FileOutputStream fos = new FileOutputStream("studentInfo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);//NotSerializableException 没有序列化的异常
        System.out.println("写出完毕");
        oos.close();

        FileInputStream fis = new FileInputStream("studentInfo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student1 = (Student) ois.readObject();
        System.out.println(student1);
        ois.close();
    }
}
