package com.java.enumdemo;

enum Mobile {
    SAMSUNG, APPLE
}

public class EnumDemo {

    public static void main(String[] args) {
        String s = "samsung";
        Mobile mobile = Mobile.APPLE;
        switch (mobile) {
            case APPLE:
                System.out.println("Apple");
                break;
            case SAMSUNG:
                System.out.println("samsung");
                break;
        }
    }
}
