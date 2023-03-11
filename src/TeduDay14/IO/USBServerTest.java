package TeduDay14.IO;

/**
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/10  17:04
 **/
public class USBServerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USBSeverEquipment mouse = new USBSeverEquipment("鼠标");
        USBSeverEquipment keyboard = new USBSeverEquipment("键盘");
        computer.Support1(mouse, keyboard);
        USBSeverEquipment light = new USBSeverEquipment("电灯");
        computer.Support2(light);
        String a = "a";
        System.out.println("a = " + a);
        Aoo aoo = new Aoo();
        int aa = 100;
        aoo.test(aa);
        System.out.println(aa);
    }
}

class Aoo {
    public void test(int a) {
        a++;
        System.out.println(a);
    }
}

interface USBSupport {
    void Support1(USBServer usbServer1, USBServer usbServer2);

    void Support2(USBServer usbServer);
}

interface USBServer {
    void Server();
}

class Computer implements USBSupport {
    @Override
    public void Support1(USBServer usbServer1, USBServer usbServer2) {
        System.out.println("电脑提供USB服务");
        usbServer1.Server();
        usbServer2.Server();
    }

    @Override
    public void Support2(USBServer usbServer) {
        System.out.println("只有一个USB设备插入了电脑,电脑提供USB服务");
        usbServer.Server();
    }
}

class USBSeverEquipment implements USBServer {
    String name;

    USBSeverEquipment() {

    }

    USBSeverEquipment(String name) {
        this.name = name;
    }

    @Override
    public void Server() {
        System.out.println(name + "开始接入电脑USB插口");
    }
}

