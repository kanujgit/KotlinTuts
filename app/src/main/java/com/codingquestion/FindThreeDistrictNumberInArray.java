package com.codingquestion;

public class FindThreeDistrictNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1};
        findDistnictNumber(arr);

    }

    private static void findDistnictNumber(int[] arr) {
        int n = arr.length;
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        if (n < 2) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("First: " + first + " second " + second + " third " + third);

    }
}
