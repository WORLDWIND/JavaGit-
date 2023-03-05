package OOPDay09;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.8之后推出了一个新特性:Lambda表达式
 * 作用:可以更简洁的代码实现匿名内部类
 * 规则:
 * 1.不是任何匿名内部类都可以转换成Lambda表达式
 * 2.Lambda对接口的要求只能是函数式接口
 * 3.函数式接口:接口中要求实现类必须重写的方法只有一个
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/5  11:45
 * 语法 :
 * (参数列表) -> {
 * 方法体
 * }
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });*/
        //TODO lambda表达式
        /*Collections.sort(list,(String o1,String o2) -> {
            return o1.length() - o2.length();
        });*/
        //TODO lambda表示式中的参数类型可以不写
       /* Collections.sort(list, (o1, o2) -> {
            return o1.length() - o2.length();
        });*/
        //TODO lambda表达式方法体中如果只有一句代码,方法体的{}可以不写,如果这句话中有return,也可以一并不屑
       /* Collections.sort(list, (o1, o2) ->
                o1.length() - o2.length()
        );*/
        list.sort((o1,o2) -> o1.length() - o2.length());
    }
}

