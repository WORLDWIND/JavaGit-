package TeduDay13.IO;

/**
 * finally的运用
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/9  15:43
 **/
public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println("程序开始了...");

        try{
            String line = "";//没有报错,下面有return 走finally不走 "程序结束了"
            System.out.println(line.length());
            return;
        }catch (Exception e){
            System.out.println("出错并解决了");
        }finally {
            System.out.println("finally中的代码执行了");
        }

        System.out.println("程序结束了");
    }
}
