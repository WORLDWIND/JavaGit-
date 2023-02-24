package OOPDay04;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/24  14:10
 **/
public class InnerClassDemo {
    public static void main(String[] args) {
        Mama mama = new Mama();
        //Baby baby = new Baby(); 编译错误 内部类对外不可见 不具备可见性
    }
}
class Mama{//外部类
    String name;
    //TODO 充当成员 类中套类 外面的称为外部类,内部的称为内部类
    void create(){
        Baby baby = new Baby(); // 内部类对象通常在外部类中创建
    }
    class Baby{//内部类
        // TODO 内部类可以直接访问外部类的成员,在内部类中有个隐式的引用指向创建它的外部类对象
        /**
         * 隐式的引用
         * this : 指代当前的对象
         * super : 指代当前对象的超类对象
         * 外部类名.this : 指代当前对象的外部类对象
         */
        void show(){
            System.out.println(name);//简写
            System.out.println(Mama.this.name);//完整写法,Mama.this指外部类对象 TODO 要么写全,要么简写
        }
    }
}