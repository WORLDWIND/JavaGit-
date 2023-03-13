package TeduDay15.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室的客户端
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/13  09:49
 **/
public class Client {
    private Socket socket;
    public Client(){
        try {
            /**
             * 实例化Socket时就是与远程服务器建立连接的过程
             * 需要传递两个参数:
             * 1.服务器IP地址,用于找到网络上对方的计算机
             * 2.服务端口,用于找到服务器计算机上的服务器的应用程序
             */
            System.out.println("正在连接服务器...");
            socket = new Socket("localhost",8088);//localhost表示本机IP
            System.out.println("与服务器连接成功!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void start(){
        //低级流:作用:将写出的字节流发送给建立连接远程计算机
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scanner = new Scanner(System.in);
            while(true){
                String message = scanner.nextLine();
                if(message.equals("exit")) break;
                pw.println(message);
//                InputStream in = socket.getInputStream();
//                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
//                BufferedReader br = new BufferedReader(isr);
//                System.out.println("服务器返回语句:"+br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
