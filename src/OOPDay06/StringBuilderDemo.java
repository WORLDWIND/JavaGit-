package OOPDay06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/1  14:27
 **/
public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuilder的创建方法
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder("abc");

        //String 和 StringBuilder互转
        String str = "str";
        StringBuilder stringBuilder = new StringBuilder(str);//String --> StringBuilder
        String str1 = stringBuilder.toString();//StringBuilder --> String

        String str2 = "好好学习Java";
        StringBuilder stringBuilder1 = new StringBuilder(str2);

        stringBuilder1.append(",为了找到好工作");
        System.out.println(stringBuilder1);//好好学习Java,为了找到好工作

        stringBuilder1.replace(9,stringBuilder1.length(),"为了改变世界");
        System.out.println(stringBuilder1);//好好学习Java,为了改变世界

        //delete删除内容
        stringBuilder1.delete(0,8);
        System.out.println(stringBuilder1);//,为了改变世界

        //insert()插入
        stringBuilder1.insert(0,"活着");
        System.out.println(stringBuilder1);//活着,为了改变世界
    }
}
