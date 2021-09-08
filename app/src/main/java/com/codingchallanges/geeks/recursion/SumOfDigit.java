package com.codingchallanges.geeks.recursion;

public class SumOfDigit {

    public static void main(String[] args) {
        int n = 89;
        System.out.println(calculateSum(n));
    }

    private static int calculateSum(int n) {
        if (n <=9) {
            return n;
        }
        return calculateSum(n / 10) + n % 10;
    }
}
