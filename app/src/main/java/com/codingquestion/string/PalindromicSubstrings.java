package com.codingquestion.string;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(isPalindrom(s.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindrom(String s){
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

}
