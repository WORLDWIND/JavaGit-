package OOPDay04;

import OOPDay03.*;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/24  16:59
 **/
public class StudentTest {
    public static void main(String[] args) {
        //同包中的类可以直接访问
        Student student = new Student();
        //OOPDay03.Dog2 dog2 = new OOPDay03.Dog2(); 不同包不能直接访问,若想访问:写类的全称------太繁琐,不建议
        //先import导入类,在直接访问类
        Dog2 dog2 = new Dog2();//不在同包下,上面必须先import,然后在访问
    }
}
