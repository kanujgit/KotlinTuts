package com.java.inheritence;

public class InheritanceDemo extends AddSub {
    public static void main(String[] args) {
        AddSub demo = new AddSub(1);
        demo.sum(2, 1);
        demo.sub(2, 3);

    }
}

class Add {
    int a = 0;

    public Add() {
        System.out.println("Add empty cons");
    }

    public Add(int a) {
        System.out.println("Add Single cons");
    }


    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("sum is : " + c);
    }

}

class AddSub extends Add {

    public AddSub() {
        System.out.println("Add sub empty cons");
    }

    public AddSub(int a) {
        System.out.println("Add sub single cons");
    }

    public void sum(int a, int b) {
        super.sum(a, b);
    }

    final void sub(int a, int b) {
        int c = a - b;
        System.out.println("Addsub is : " + c);
    }
}
