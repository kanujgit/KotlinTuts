package com;


// A simple Java program to demonstrate multiple
// inheritance through default methods.
// A simple Java program to demonstrate multiple
// inheritance through default methods.
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

// Implementation class code
class TestClass implements PI1, PI2 {
    // Overriding default show method
    public void show() {
        // use super keyword to call the show
        // method of PI1 interface
        PI1.super.show();

        // use super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
    }

    public static void main(String args[]) {
//        TestClass d = new TestClass();
//        d.show();
        String s = "This is a boy";
        sortSubString(s);
    }

    private static void sortSubString(String s) {
        String[] str = s.split(" ");
        for(String words : str){

        }
    }
}
