package com.socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 开发服务端
 * 使用线程池
 */
public class ServerDemo2 {
    // 使用静态变量记住一个线程池对象
    private static ExecutorService pool = new ThreadPoolExecutor(2, 3, 6,
            TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        System.out.println("========服务端启动========");
        try {
            ServerSocket serverSocket = new ServerSocket(5666);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "它来了，上线了！");
                ServerReaderRunnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

