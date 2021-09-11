package com.java.inner;

public class InnerClaasDemo {
    public static void main(String[] args) {
        A a = new A();
        //A.Ainner ainner = a.new Ainner();
        System.out.println(A.Ainner.j);

    }
}
class A{
    int i=9;
    static class Ainner{
       static int j=10;
    }
}
