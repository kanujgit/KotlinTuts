package com.codingquestion;

public class RemoveSubStringRepeatedly {
    public static void main(String[] args) {
        System.out.println(getLength("abcaacbaaaacc", "abc", "ac", "aaa"));
    }

    public static int getLength(String s1, String s2, String s3, String s4) {

        int count = 3;
        for (int i = 0; i < count; i++) {
            while (s1.contains(s2))
                s1 = s1.replace(s2, "");
            System.out.println("strng1::"+s1);


            while (s1.contains(s3))
                s1 = s1.replace(s3, "");
            System.out.println("strng2::"+s1);


            while (s1.contains(s4))
                s1 = s1.replace(s4, "");
            System.out.println("strng3::"+s1);


            if (i >= 2) {
                System.out.println("as" + i);
                if (s1.contains(s2)) {
                    count++;
                }
                if (s1.contains(s3)) {
                    count++;
                }
                if (s1.contains(s4)) {
                    count++;
                }
            }
        }
        return s1.length();
    }
}
