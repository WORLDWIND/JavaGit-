package Day08;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/20  09:31
 **/
public class OverloadDemo {
    //TODO  方法的重载
    public static void main(String[] args) {
        test();
        test("hello",19);
        test(19,"hello");
    }
//    public static int test(){
//        return 1;
//    }
    public static void test(){

    }
    public static void test(String name,int a){
        System.out.println(a+"name");
    }
    public static void test(int a,String name){
        System.out.println(a+"name");
    }
    public static void test(int a){

    }
    /*public static int test(){
        return 1;
    }*/
}
