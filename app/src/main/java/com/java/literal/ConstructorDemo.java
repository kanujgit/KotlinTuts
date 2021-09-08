package com.java.literal;

public class ConstructorDemo {
    int a;
    float b;
    String c;

    public ConstructorDemo() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public ConstructorDemo(double n){
        System.out.println(n);
    }



    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo(3);
    }
}
