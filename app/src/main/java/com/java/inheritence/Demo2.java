package com.java.inheritence;

public class Demo2 extends A {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.msg();
    }

    @Override
    protected void msg() {
        System.out.println("override");
    }
}

class A {
    protected void msg() {
        System.out.println("Hello java");
    }
}
