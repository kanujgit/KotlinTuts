package com.java.cloning;

public class DeepCopy {
    public static void main(String[] args) {
        A  a = new A();
        a.i =10;
        a.j =20;
        System.out.println(a);
        A aa = new A();
        aa.i =1;
        aa.j= 2;
        System.out.println(aa);
    }
}
class A{
    public int i;
    public int j;
    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
