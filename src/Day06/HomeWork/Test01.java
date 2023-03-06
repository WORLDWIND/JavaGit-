package Day06.HomeWork;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  17:39
 **/
public class Test01 {
    public static void main(String[] args) {
        say();
        sayHi("WorldWind");
        sayHello("WorldWind",22);
        System.out.println(getNum());
        System.out.println(plus(1, 2));
        int[] arr = testArray(100);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void say(){
        System.out.println("Hello.txt World");
    }
    public static void sayHi(String name){
        System.out.println(name + "向你打招呼");
    }
    public static void sayHello(String name,int age){
        System.out.println("我叫" + name + ",今年" + age + "岁了");
    }
    public static int getNum(){
        return (int)(Math.random()*100+1);
    }
    public static int plus(int a,int b){
        return a + b;
    }
    public static int[] testArray(int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int)(Math.random()*100+1);
        }
        return arr;
    }
}

