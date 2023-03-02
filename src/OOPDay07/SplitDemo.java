package OOPDay07;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/2  10:17
 **/
public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123dfg456kji";
        String[] data = line.split("[0-9]+");
//        for (String datum : data) {
//            System.out.println(datum);
//        }
        System.out.println(Arrays.toString(data));

        line = "123.456.78";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));

        /**
         * 最开始为可拆分项,那么第一数组为孔字符串
         * 如果连续两个可拆分项,那么中间会拆出来一个空字符串
         * 如果尾部有多个可拆分项,那么拆分出来的空字符串就被省略了(不要了)
         */
        line = "..123.456..78.....";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));
        System.out.println(data.length);//6
    }
}
