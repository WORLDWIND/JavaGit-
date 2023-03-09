package TeduDay13.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK1.7之后推出的特性:自动关闭的特性
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  16:40
 **/
public class AutoCloseableDemo {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        try(
            //自动关闭特性是便器认可的,代码编译后会变成FinallyDemo1的样子
            //在try()中定义的内容最终会被编译修改为finally中调用close()关闭操作
            /*FileOutputStream fos = new FileOutputStream("test1/test/pw.txt");*/
            FileOutputStream fos = null;
        ){
            fos.write(1);
        }catch (IOException e){
            System.out.println("出现了IO异常");
        } catch (Exception e){
            System.out.println("出现了异常");
        }
        System.out.println("程序结束了");
    }
}
