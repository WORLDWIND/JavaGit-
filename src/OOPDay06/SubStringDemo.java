package OOPDay06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  12:28
 **/
public class SubStringDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        //int start = 4;
        int start = str.indexOf(".") + 1;
        //int end = 8;
        int end = str.indexOf(".",start);//双后缀
        System.out.println(str.substring(start, end));//截取下标4~7 包前不包后
        System.out.println(str.substring(start, end));
    }
}
