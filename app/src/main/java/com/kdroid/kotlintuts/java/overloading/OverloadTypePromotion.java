package com.kdroid.kotlintuts.java.overloading;

public class OverloadTypePromotion {
//    void sum(int a, long b) {
//        System.out.println(a + b);
//        String type = ((Object)(a)).getClass().getSimpleName();
//        String type2 = ((Object)(b)).getClass().getSimpleName();
//        System.out.println(type+" and "+type2);
//    }
//    void sum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }

    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

//    void sum(int a,int b){System.out.println("int arg method invoked");}
//    void sum(long a,long b){System.out.println("long arg method invoked");}



    public static void main(String args[]) {
        OverloadTypePromotion obj = new OverloadTypePromotion();
       // obj.sum(20, 20);//now second int literal will be promoted to long
       // obj.sum(20, 20, 20);

    }
}
