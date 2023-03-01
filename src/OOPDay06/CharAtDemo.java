package OOPDay06;

/**
 * char charAt(int index)
 * 返回当前字符串指定位置的字符(index)-------根据位置找字符
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  09:01
 **/
public class CharAtDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        char c = str.charAt(9);//str中下标为9所对应的字符
        System.out.println(c);//i
        String line = "1234567890qwertyuiopasdfghjklzxcvbnm";
        StringBuffer SB = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * (line.length() - 1));
            SB.append(line.charAt(x));
        }
        System.out.println(SB);
    }
}
