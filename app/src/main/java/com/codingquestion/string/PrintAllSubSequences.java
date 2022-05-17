package com.codingquestion.string;

public class PrintAllSubSequences {
    public static void main(String[] args) {
        String str = "abc";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.print(str.subSequence(i,j)+" ");
            }
        }
        System.out.println();
    }
}
