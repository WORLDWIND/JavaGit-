package OOPDay03;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/23  14:24
 **/
public class ComputerUSBServer {
    // TODO 接口实现
    //  用接口模拟电脑对USB的支持
    public static void main(String[] args) {
        /**开始实现 模拟电脑对USB接口的支持*/
        Light light1 = new Light("小爱");
        Light light2 = new Light("ChatGPT");
        Computer computer = new Computer(light1,light2);//TODO 模拟插入两个USB接口的服务对象
        computer.supporter();//TODO 实现支持
    }
}
// TODO 这个电脑只有两个USB接口,实现两个接口
class Computer implements USBSupporter {
    public USBServer user1;
    public USBServer user2;
    Computer(){

    }
    Computer(USBServer user1,USBServer user2){
        this.user2 = user2;
        this.user1 = user1;
    }
    @Override
    public void supporter() {
        System.out.println("电脑开始供电,支持USB");
        user1.server();
        user2.server();
    }
}
// TODO 使用USB接口的用电器
class Light implements USBServer {
    String name;
    Light(){

    }
    Light(String name){
        this.name = name;
    }
    @Override
    public void server() {
        System.out.println(name+"开始启动");
    }
}

//USB服务 使用USB服务
interface USBServer {
    void server();
}

//电脑支持USB
interface USBSupporter {
    void supporter();
}
