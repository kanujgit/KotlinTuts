package com.codingquestion;

public class DecodeString {
    public static void main(String[] args) {
        String a = "a11";
        System.out.println(decompressString(a));
    }

    private static String decompressString(String a) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                if (Character.isDigit(a.charAt(i + 1))) {
                    continue;
                }
                int number = a.charAt(i) - '0';
                for (int j = 0; j < number - 1; j++) {
                    s = s.append(a.charAt(i - 1));
                }
            } else {
                s = s.append(a.charAt(i));
            }
        }
        return s.toString();
    }
}
