package com.kdroid.kotlintuts.java.literal;

public class StaticDemo {
    public static void main(String[] args) {
        Static aStatic = new Static();
        Static bStatic = new Static();
        Static cStatic = new Static();

        aStatic.increment();
        aStatic.print();
        bStatic.increment();
        aStatic.print();
        cStatic.increment();
        cStatic.print();

    }
}

class Static {
   static int a;
   int b;

    public static void increment() {
        a++;
    }

    public void print() {
        System.out.println(a);
    }
}
