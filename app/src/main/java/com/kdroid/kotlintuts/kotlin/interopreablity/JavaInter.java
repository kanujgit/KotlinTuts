package com.kdroid.kotlintuts.kotlin.interopreablity;

public class JavaInter {
    public static void main(String[] args) {
        //Now here shown as error
        //int sum  =InteropreablityDemoKt.add(2,3);

        // using file annotations
        int sum    = MyCustomKotlinFileName.add(2,3);
        System.out.println("sum is  "+sum);
    }
    public static int getArea(int a ,int b){
        return a*b;
    }
}
