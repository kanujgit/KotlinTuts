package com.kdroid.kotlintuts.java.AbstractAndInterface;

public class AbstractDemo {

    public static void main(String[] args) {
        MaheshPhone ramesh = new SureshPhone();
        ramesh.dance();
        ramesh.call();
        ramesh.move();
        ramesh.cook();
    }

}


abstract class MaheshPhone{

    public void call(){
        System.out.println("calling...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class Ramesh extends MaheshPhone{

    @Override
    public void move() {
        System.out.println("moving");
    }

}
class SureshPhone extends Ramesh{  // concrete class

    @Override
    public void dance() {
        System.out.println("dancing...");
    }

    @Override
    public void cook() {
        System.out.println("cooking...");
    }
}