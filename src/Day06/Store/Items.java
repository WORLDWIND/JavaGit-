package Day06.Store;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/17  14:23
 **/
//货物的父类
public class Items {
    double price;
}

//饮料
class Beverages extends Items {
    Beverages() {
        super.price = 3.0;
    }
}

//水
class Water extends Items {
    Water() {
        super.price = 1.0;
    }
}

//零食
class Snacks extends Items {
    Snacks() {
        super.price = 5.0;
    }
}