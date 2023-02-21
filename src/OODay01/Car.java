package OODay01;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/21  16:13
 **/

/** 汽车类 */
public class Car {
    private String brand;
    private String color;
    private double price;
    Car(){

    }
    Car(String brand,String color,double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public void Start(){
        System.out.println(getBrand()+"牌子的"+getColor()+"颜色的"+getPrice()+"块钱的车启动了");
    }
    public void Running(){
        System.out.println(getBrand()+"牌子的"+getColor()+"颜色的"+getPrice()+"块钱的车开始跑了");
    }
    public void Stop(){
        System.out.println(getBrand()+"牌子的"+getColor()+"颜色的"+getPrice()+"块钱的车停止了");
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
