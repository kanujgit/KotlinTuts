package com.java.inner;

interface AInnerInterface {
    public void show();
}

public class InnerClaasDemo {
    public static void main(String[] args) {
        A a = new A();
        AInnerInterface aInnerInterface = () -> System.out.println("show");
        // aInnerInterface.show();
        A aa = new A() {
            public void show() {
                System.out.println("print AA");
            }
        };
        aa.show();


    }


}

class A {
    public void show() {
        System.out.println("show");
    }

    //int i=9;
    class Ainner {
        //  int j=10;
        public void show() {
            System.out.println("show");
        }
    }
}
