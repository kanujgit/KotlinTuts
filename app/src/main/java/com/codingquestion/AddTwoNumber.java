package com.codingquestion;

public class AddTwoNumber {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "1";
        int len1 = s1.length() - 1;
        int len2 = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (len1 >= 0 && len2 >= 0) {
            int val = carry + s1.charAt(len1) - '0' + s2.charAt(len2) - '0';
            carry = val / 10;
            result.insert(0, val);
            len1--;
            len2--;
        }
        while (len1 >= 0) {
            int val = carry + s1.charAt(len1) - '0';
            carry = val / 10;
            result.insert(0, val);
            len1--;

        }

        while (len2 >= 0) {
            int val = carry + s2.charAt(len2) - '0';
            carry = val / 10;
            result.insert(0, val);
            len2--;
        }
        if (carry != 0) {
            result.insert(0, carry);
        }
        System.out.println("sum is " + result);
    }
}
