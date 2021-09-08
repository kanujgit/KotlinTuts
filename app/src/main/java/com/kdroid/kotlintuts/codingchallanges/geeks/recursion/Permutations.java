package com.kdroid.kotlintuts.codingchallanges.geeks.recursion;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        int i = 0;
        findAllPermutations(s, i, s.length() - 1);
    }

    private static void findAllPermutations(String s, int i, int n) {
        if (n == i) {
            System.out.println(s);
        } else {

            for (int j = i; j <= s.length()-1; j++) {
                s = swap(s, i, j);
                findAllPermutations(s, i + 1, n);
                s = swap(s, i, j);
            }
        }
        System.out.println("Exit");
    }

    private static String swap(String s, int i, int j) {
        char tmp;
        char[] charArray = s.toCharArray();
        tmp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = tmp;
        return String.valueOf(charArray);

    }

}
