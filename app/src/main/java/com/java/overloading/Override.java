package com.java.overloading;

class Print {
    public synchronized void print(int sum) {
        System.out.println("sum is " + sum);
    }
}

class AddDemo extends Print {

    public synchronized void sum(int a, int b) {
        print(a + b);
    }
}

public class Override extends AddDemo {

    public static void main(String[] args) {
        AddDemo addDemo = new AddDemo();
        addDemo.sum(2, 3);
        ThreadDemo1 demo1 = new ThreadDemo1(addDemo);
        demo1.start();
        ThreadDemo2 demo2 = new ThreadDemo2(addDemo);
        demo2.start();
    }
}

class ThreadDemo1 extends Thread {

    private final AddDemo addDemo;

    public ThreadDemo1(AddDemo addDemo) {
        this.addDemo = addDemo;
    }

    public void run() {
        addDemo.sum(2, 4);
    }
}

class ThreadDemo2 extends Thread {
    private final AddDemo addDemo;

    public ThreadDemo2(AddDemo addDemo) {
        this.addDemo = addDemo;
    }

    public void run() {
        addDemo.sum(2, 3);
    }
}

