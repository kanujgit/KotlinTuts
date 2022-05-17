package com.codingquestion.string;

public class SubSequenceOfOthers {
    public static void main(String[] args) {
        String str = "ABCD";
        String find = "AD";
        findSubSequence(str, find);
    }

    private static void findSubSequence(String str, String find) {

        int j = 0;
        for (int i = 0; i < str.length() && j < find.length(); i++) {
            if (str.charAt(i) == find.charAt(j)) {
                j++;
            }
        }
        if (j == find.length()) {
            System.out.println("true");
        } else {
            System.out.println("FALSE");
        }
    }
}
