package TeduDay12.NightWork;

/**
 * 随便玩玩
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/8  19:31
 **/
public class test {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2147483647; i++) {
            count++;
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
