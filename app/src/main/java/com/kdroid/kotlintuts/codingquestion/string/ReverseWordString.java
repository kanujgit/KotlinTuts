package com.kdroid.kotlintuts.codingquestion.string;

public class ReverseWordString {
    public static void main(String[] args) {
        String s = "My Name is gaurav";
        reverseString(s);
    }

    private static void reverseString(String s) {
        String[] charArr = s.split("\\s");
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.println(charArr[i]);
        }

    }
}
