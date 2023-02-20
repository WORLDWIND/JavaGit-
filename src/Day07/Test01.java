package Day07;

import java.util.Arrays;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/18  14:08
 **/
public class Test01 {
    public static void main(String[] args) {
        Test[] tests = new Test[10];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = new Test();
            tests[i].a = (int)(Math.random()*100+1);
        }
        //Arrays.sort(tests);
        System.out.println(Arrays.toString(tests));
        for (Test test : tests) {
            System.out.println(test.a);
        }
    }//15124537486
}
class Test{
    int a;
}