package com.socket;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 开发服务端
 * 使用线程池
 */
public class ServerDemo1 {
    public static void main(String[] args) {
        System.out.println("========服务端启动========");
        try {
            ServerSocket serverSocket = new ServerSocket(7666);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "它来了，上线了！");
                // 用Thread或者Runnable都可以
//                new ServerReaderThread(socket).start();
                new Thread(new ServerReaderRunnable(socket)).start();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

