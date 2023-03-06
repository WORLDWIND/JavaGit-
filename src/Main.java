public class Main {
    public static void main(String[] args) {
//        // TODO 九九乘法表
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print(j + "*" + i + "=" + i * j + "\t");
//            }
//            System.out.println();
//        }
        int[] arr = {};
        System.out.println(arr);

        String a = "Hello.txt World";
        char[] chars = a.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

//        Aoo a1 = new Aoo();
//        a1.a = 100;
//        a1.b = 100;
//        System.out.println(a1.a);
//        System.out.println(a1.b);
//        a1.b = 1000;
//        System.out.println(a1.b);
        System.out.println(Aoo.abc());

    }
}
class Aoo{
    static int a;
    //static int b;
    static {
        a = 4;
    }
    static int abc(){
        return a;
    }
    static {
        a /= 3;
    }
}
interface aa{

}
interface bb{

}
interface cc extends aa,bb{

}
class c implements aa,bb,cc{

}
