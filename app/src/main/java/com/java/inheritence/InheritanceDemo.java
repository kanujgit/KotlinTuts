package com.java.inheritence;

interface Add {
    void sum();

}

interface AddSub {
    void sum();

}

public class InheritanceDemo implements AddSub, Add {
    public static void main(String[] args) {

        InheritanceDemo demo = new InheritanceDemo();
        demo.sum();
    }

    @Override
    public void sum() {
        //System.out.println("Hello");
    }
}
