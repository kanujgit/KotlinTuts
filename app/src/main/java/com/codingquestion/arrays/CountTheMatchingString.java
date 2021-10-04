package com.codingquestion.arrays;

import java.util.HashSet;
import java.util.Set;

public class CountTheMatchingString {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
        int fMin, sMin, fMax, sMax, len;
        fMin = sMin = Integer.MIN_VALUE;
        fMax = sMax = Integer.MAX_VALUE;
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> a = new HashSet<>();
        Set<Character> w = new HashSet<>();
        int count = 0;
        for (Character c : allowed.toCharArray())
            a.add(c);
        System.out.println(a);

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                w.add(words[i].charAt(j));
            }
            if (a.containsAll(w)) {
                System.out.println(count + "c");
                count++;
            }
            System.out.println(w);
            w.clear();
        }
        return count;
    }
}
