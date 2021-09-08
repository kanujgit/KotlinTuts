package com.java.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {

//        Hello  hello = new Hello();
//        hello.printHello();
//        hello.printHello(3);

        B b = new B();
        A a = new A();
        A objA;
        b =null;

        objA = b;
        objA.show();
        b.show();
    }
}

class Hello{ // Method overloading , Early Binding, Static Binding, Compile time polymorphism
    public void printHello(){
        System.out.println("Hello");
    }
    public void printHello(int i){
        System.out.println("hello "+i);
    }
}

class A{ // Method overriding, Late binding, Dynamic Binding , Runtime Polymorphism
    public void show(){
        System.out.println("Show A");
    }
}
class B extends A{
    @Override
    public void show() {
        System.out.println("Show B");
    }
}
