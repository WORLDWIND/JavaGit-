package OOPDay06;

/**
 * String 和 StringBuilder 的对比
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  13:22
 **/
public class StringAndStringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("a");
        for (int i = 0; i < 10000000; i++) {
            builder.append(i+",");
        }
        builder.delete(builder.length() - 1,builder.length());
        System.out.println(builder);
        System.out.println("执行完毕");
    }
}
