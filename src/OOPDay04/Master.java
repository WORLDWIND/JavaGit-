package OOPDay04;

/**
 * @Author Mr.WorldWind
 * @Date 2023/2/24 10:28
 * @PackageName: OOPDay04
 * @ClassName: Master
 */
/**主人*/
public class Master {
    void feed(Animal animal){
        animal.eat();
        animal.drink();
    }
    void swim(Swim swim){
        swim.swim();
    }

}
