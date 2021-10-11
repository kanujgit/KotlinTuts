package com.codingchallanges.geeks.recursion;

public class FindAllSubset {
    static String[] arr = new String[10];
    static int i = 0;

    public static void main(String[] args) {
        //    findSubset("abc", "", 0);
        findSubSetOptimal("123");
        for (String ch : arr
        ) {
            if (ch != null)
                System.out.println(ch);
        }
    }

    private static void findSubset(String s, String curr, int index) {
        if (s.length() == index) {
            if (!curr.isEmpty())
                arr[i++] = curr;
            return;
        }
        findSubset(s, curr, index + 1);
        findSubset(s, curr + s.charAt(index), index + 1);
    }

    private static void findSubSetOptimal(String s) {

        int n = s.length();
        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(s.charAt(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
