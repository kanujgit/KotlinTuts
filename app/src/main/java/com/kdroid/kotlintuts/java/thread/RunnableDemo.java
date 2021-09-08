package com.kdroid.kotlintuts.java.thread;

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread first: " + i);
            }
        }).start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread second:" + i);
                }
            }
        };

//        Thread thread = new Thread(runnable);
//        thread.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        System.out.println(thread1.getName());

        thread1.join();
        System.out.println("Bye");
    }
}
