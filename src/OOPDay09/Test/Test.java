package OOPDay09.Test;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/4  11:38
 **/
public class Test {
    public static void main(String[] args) {
        String str = "  qwer asdf zxcv  ";
        int i = str.indexOf("as");
        System.out.println(i);

        String[] arr = str.split("\\s");
        System.out.println(Arrays.toString(arr));

        System.out.println(str.length());

        System.out.println(str.toUpperCase());

        char[] c = str.toCharArray();
        String str1 = "";
        System.out.println(Arrays.toString(c));
        for (int j = 0; j < c.length; j++) {
            str1+=c[j];
        }
        System.out.println(str1);
    }
}
