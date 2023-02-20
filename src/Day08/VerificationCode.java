package Day08;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/20  16:10
 **/
public class VerificationCode {
    public static void main(String[] args) {
        /**
         * 需求:生成?位验证码(大写字母,小写字母,数字)
         */
        System.out.println(createVerificationCode(4));
        /*String str = ""+','+'w';
        System.out.println(str);*/

    }
    // TODO 生成验证码
    public static String createVerificationCode(int len){
        String code = "";
//        String[] num = new String[len];
//        for (int i = 0; i < num.length; i++) {
//            num[i] =(int)(Math.random()*9)+"";
//        }
//        for (int i = 0; i < num.length; i++) {
//            code += num[i];
//        }
        //char[] chs = {'a','b','c','d','e','A','B','C','D','E','0','1','2','3','4','5'};
        char[] chs = new char[len];
        for (int i = 0; i < len; i++) {
            //code += chs[(int)(Math.random()*chs.length)];
            int a = (int)(Math.random()*3+1);
            switch (a){
                case 1:
                    chs[i] = (char)(Math.random()*25+65);
                    break;
                case 2:
                    chs[i] = (char)(Math.random()*25+97);
                    break;
                case 3:
                    chs[i] = (char)(Math.random()*10+48);
                    break;
            }
        }
        for (int i = 0; i < len; i++) {
            code+=chs[i];
        }
        return code;
    }
}
