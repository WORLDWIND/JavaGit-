package Day06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  11:39
 **/
public class MethodDemo {
    public static void main(String[] args) {
        //TODO 方法单元 - 方法的演示
        say();//必须调用
        new java() {
            @Override
            public void test() {
                System.out.println("hello,world");
            }
        }.test();
        new test(new Method1() {
            @Override
            public String test() {
                return "Hello World";
            }
        });
    }

    public static void say() {
        System.out.println("大家好,我是LYH,今年22岁了");
    }

    abstract static class java {
        public abstract void test();
    }
}

abstract class Method1 {
    public abstract String test();
}

class test {
    test(Method1 method1) {
        System.err.println(method1.test());
    }
}