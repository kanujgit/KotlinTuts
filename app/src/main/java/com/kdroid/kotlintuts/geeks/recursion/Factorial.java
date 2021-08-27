package com.kdroid.kotlintuts.geeks.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(getFactorial(5));
    }

    public static int getFactorial(int n) {
        if(n==0|| n==1){
            return 1;
        }else {
            return n*getFactorial(n-1);
        }
    }

}
