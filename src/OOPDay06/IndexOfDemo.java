package OOPDay06;

/**
 * int indexOf(String s)
 * 检索给定字符串(s)在当前字符转第一次出现的位置-----根据字符串找位置
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  09:17
 **/
public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        int index = str.indexOf("in");//检索in在str中第一次出现的位置
        System.out.println(index);//2

        index = str.indexOf("in",6);//从下标6开始找in第一次出现的位置
        System.out.println(index);//9

        index = str.indexOf("abc");//若字符串在str中不存在则返回-1
        System.out.println(index);//-1

        index = str.lastIndexOf("in");
        System.out.println(index);
    }
}
