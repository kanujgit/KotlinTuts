package com.codingquestion.string;

public class StringLiteral {
    public static void main(String[] args) {
        String s1 = "anuj";
        String s2 = "anuj";
        String s3 = new String("anuj");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

    }
}
