package com.codingquestion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveAnagram {
    public static void main(String[] args) {
        String[] arr= new String[]{"abba","baba","bbaa","cd","cd"};
        System.out.println(new Solution1().removeAnagrams(arr));
    }
}

class Solution1{
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        int N = words.length;
        HashSet<String> found = new HashSet<String> ();
        for (int i = 0; i < N; i++) {
            String word = words[i];

            char []tmp = word.toCharArray();
            Arrays.sort(tmp);
            word = tmp.toString();


            if (!found.contains(word)) {
                res.add(words[i]);
                found.add(word);
            }
        }
        System.out.println(res);
        return res;
    }
}
