package com.java.literal;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a =5;
        int b =-4;
        a =a^b; //101 XOR 100 => 001
        b =a^b;//001 XOR 100 => 101 ==> 5
        a =a^b;//001 XOR 101 => 100 ==> 4
        System.out.println(a +" "+b);

    }
}
