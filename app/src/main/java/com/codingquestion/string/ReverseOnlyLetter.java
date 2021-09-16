package com.codingquestion.string;

public class ReverseOnlyLetter {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }


    public static String reverseOnlyLetters(String s) {
        String[] arr = s.split("-");
        int i;
        for (i = 0; i < arr.length; i++) {
            //arr[i] = reverse(arr[i]);
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        int index = 0;
        StringBuilder newString = new StringBuilder("");
        for (String str : arr
        ) {
            ++index;
            newString.append(str);
            if (index <= arr.length - 1) {
                newString.append("-");
            }
        }
        return newString.toString();
    }

    public static String reverse(String str) {
        int start = 0;
        int end = str.length() - 1;
        char[] strArray = str.toCharArray();
        char tmp;

        while (start <= end) {
            tmp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = tmp;
            start++;
            end--;
        }
        return new String(strArray);
    }
}
