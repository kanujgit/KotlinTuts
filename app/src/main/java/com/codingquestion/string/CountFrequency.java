package com.codingquestion.string;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        String str = "abbaaac";
        //count(str);
        System.out.println(toFormat(str));
    }
    private static void count(String str) {
        char start = str.charAt(0);
        int count =0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == start){
                count++;
            }else {
                start = str.charAt(i);
                sb.append(count );
                sb.append(start);
                count =0;
            }
        }
        System.out.println(sb.toString());
    }

    public static String  toFormat(String input) {
        char[] inChar = input.toCharArray();
        StringBuilder output = new StringBuilder();
        int i;
        for(i=0;i<input.length();i++) {
            int count = 1;
            while(i+1<input.length() && inChar[i] == inChar[i+1]) {
                count+=1;
                i+=1;
            }
            output.append(count).append(inChar[i]);
        }
        return output.toString();
    }
}
