package com.socket;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) {
        System.out.println("========客户端启动========");
        try{
            // 1.创建Socket管道请求服务端的链接
            Socket socket = new Socket("127.0.0.1", 5666);
            // 2.从Socket管道中得到一个字节输出流
            OutputStream os = socket.getOutputStream();
            // 3.打包成打印流
            PrintStream ps = new PrintStream(os);
            // 4.发送消息
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请输入要发送的消息：");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }
            // 不用关闭资源
//          ps.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
