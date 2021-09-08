package com.java.AbstractAndInterface;


interface Abc{
    void show();
}
interface AbcStatic{
    static void show(){
        System.out.println("show static body");
    }
}
interface Pqr{
    default void show(){
        System.out.println("Pqr show");
    }
}

class Impl implements Abc,Pqr {
    @Override
    public void show() {
        System.out.println("impl show");
    }
}

public class InterfaceDemo implements Abc,Pqr  {
    public static void main(String[] args) {
        AbcStatic.show();
//        InterfaceDemo demo = new InterfaceDemo();
//        demo.show();
        //Abc abc =()  -> System.out.println("show in main");
//        Abc abc = new Abc() {
//            @Override
//            public void show() {
//
//            }
//        };
//        abc.show();


    }

    @Override
    public void show() {
//        Abc.super.show();
        Pqr.super.show();
      //  Abc.super.show();

    }
}

