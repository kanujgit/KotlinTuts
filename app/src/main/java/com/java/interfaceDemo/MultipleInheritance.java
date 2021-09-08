package com.java.interfaceDemo;

public class MultipleInheritance  {
    public static void main(String[] args) {
        MultipleInheritanceDemo demo = new MultipleInheritanceDemo();
        demo.show();
    }

}

class MultipleInheritanceDemo implements PI1,PI2{

    @Override
    public void show() {
        PI1.super.show();
        PI2.super.show();
    }
}

interface PI1 {
    // default method
     default void show() {
        System.out.println("Default PI1");
    }
}

interface PI2 {
    // Default method
    default void show() {
        System.out.println("Default PI2");
    }
}
