package com.ittest;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程被执行了：" + i);
        }
    }


}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程被执行了:" + i);
        }
    }
}

