package Day06;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  15:43
 **/
public class MethodDemo1 {
    public static void main(String[] args) {
        int[] e = testArray();
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+"\t");
        }
    }
    public static int[] testArray(){
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100+1);
        }
        return arr;
    }
}
