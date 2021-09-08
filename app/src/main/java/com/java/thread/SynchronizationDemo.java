package com.java.thread;

public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.increments();
        System.out.println(counter.count);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increments();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increments();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread2.join();

        System.out.println(counter.count);
    }
}

class Counter {
    int count;

    public void increments() {
        synchronized (Counter.class) {
            count++;
        }
    }
}
