package OOPDay05;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/27  10:20
 **/
public class Point {
    /*
     * getter 和 setter的原因
     * 1) 很多框架配置操作基于getter和setter进行的,可以设计getter和setter理解为一种行业标准
     * 2)可以更好的保证数据的合法性(引因为方法中可以做条件控制)
     * 3)getter和setter可以选择性存在(只有getter或只有setter) 只存不取setter,只取不存getter 控制权限
     */


    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
