package com.codingquestion.recursion;

public class CountDigit {
    static int count = 1;

    public static void main(String[] args) {
        int n = 0;
//        calculateSum(n);
        System.out.println(calculateSum(n));
    }

    private static int calculateSum(int n) {
        if (n <= 9) {
            return count;
        }
        return calculateSum(n / 10) + count;
    }
}
