package TeduDay13.IO;

/**
 * 异常处理机制
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  14:22
 **/
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try {
            /*String line = null;
            System.out.println(line.length());*/ //因为上一次发生了异常,所以try语句块及一下代码不会执行
            /*String line = "";
            System.out.println(line.charAt(0));*/
            String line = "abc";
            System.out.println(Integer.parseInt(line));
        }catch (NullPointerException e){
            System.out.println("出现空指针异常");
        }catch (StringIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e);
        }catch (Exception e){//最后捕获超类异常,凡是该异常的子类都可以被捕获并处理
            System.out.println(e);
        }
        System.out.println("程序结束了...");
    }
}
