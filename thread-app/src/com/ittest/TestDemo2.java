package com.ittest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDemo2 {
    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "执行");
//            }
//        }, "t1线程");
//        t.start();
//        MyThread t2 = new MyThread("t2线程");
//        t2.start();

        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());  // 已经没有线程可以执行了

    }
}


class MyThread1 extends Thread {

    public MyThread1(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "执行了" + i + "次");
//            System.out.println(Thread.currentThread().getName());
        }
    }
}


class MyRunnable implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + "线程执行了" + i + "次");
        }
    }
}