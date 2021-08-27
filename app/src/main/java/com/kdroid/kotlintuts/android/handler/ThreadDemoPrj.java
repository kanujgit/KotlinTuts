package com.kdroid.kotlintuts.android.handler;

public class ThreadDemoPrj {
    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo();
       // demo.start();
        new ThreadRunnableDemo().start();
    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("thread out: "+Thread.currentThread().getName());
    }
}
class ThreadRunnableDemo extends Thread{
    @Override
    public void run() {
        System.out.println("thread runable: "+Thread.currentThread().getName());
    }
}
