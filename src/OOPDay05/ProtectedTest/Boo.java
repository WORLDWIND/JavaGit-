package OOPDay05.ProtectedTest;

import OOPDay05.Aoo;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  09:52
 **/
public class Boo extends Aoo {

    public static void main(String[] args) {
        Boo boo = new Boo();
        System.out.println("不同包的Boo中a = "+boo.a);
        //System.out.println(boo.b);  'b' 在 'OOPDay05.Aoo' 中不为 public。无法从外部软件包访问
    }
}
