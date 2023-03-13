package TeduDay15.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室的服务器
 *
 * @program: Tedu
 * @author: Mr.WorldWind
 * @create: 2023/3/13  09:48
 **/
public class Server {
    /**
     * 运行在服务器的ServerSocket的主要任务:
     * 1)向服务器像服务端口,客户端是通过该端口与服务器简历连接的
     * 2)监听服务端口,一旦一个客户端连接了就会立即创建一个Socket实例与之交互
     * 我们将ServerSocket比喻为某客服中心的"总机"
     */
    private ServerSocket serverSocket;

    public Server() {
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务点启动完毕");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void start() {
        /**
         * ServerSocket提供的重要方法
         * Socket accept()
         * 用于接收客户的连接,并返回一个Socket实例与连接的客户端交互
         * 该方法端是一个阻塞方法,调用后程序会"卡住",直到一个客户端连接为止
         */
        try {
            while (true) {
                System.out.println("等待客户连接");
                Socket socket = serverSocket.accept();
                System.out.println("有个用户连接上了");
                System.out.println("目前有个用户");
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            /*String message = br.readLine();
            System.out.println("客户端说:" + message);*/
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println("的客户端说:" + message);
                    OutputStream out = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                    BufferedWriter bw = new BufferedWriter(osw);
                    PrintWriter pw = new PrintWriter(bw, true);
                    pw.println(message);

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
