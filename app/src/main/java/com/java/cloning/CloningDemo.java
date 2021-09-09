package com.java.cloning;

import androidx.annotation.NonNull;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.i = 10;
        b.j = 20;
        System.out.println(b);
        B b1 = (B)b.clone();
        b1.i =1;
        b1.j =2;
        System.out.println(b1);

    }
}

class B  extends Object implements Cloneable{
    public int i;
    public int j;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

