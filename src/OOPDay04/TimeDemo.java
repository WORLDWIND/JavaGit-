package OOPDay04;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 匿名内部类的练习 -- 定时器
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/2/24  15:48
 **/
public class TimeDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();//定时器对象
        int interval = 1000;//定时间隔(以毫秒为单位)
        //TODO 定闹钟7点响,只需要定一次,可以设计为匿名内部类对象
        timer.schedule(new TimerTask() {
            @Override
            public void run() {// 定时干的事 --- 每1000毫秒,自动执行
                System.out.println("七点啦");
            }
        }, interval,interval);//TODO  写了一个interval 只执行一次 第二个是每隔多长时间执行一次,重复执行

    }
}
