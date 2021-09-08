package com.kdroid.kotlintuts;


public class Test {
    static {
        System.out.println("static");
    }

    {
        System.out.println("block");
    }

    public Test() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        Test a = new Test();
    }
}

