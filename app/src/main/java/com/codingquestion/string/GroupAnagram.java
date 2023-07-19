package com.codingquestion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(str);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String s : strs) {
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            if (!map.containsKey(sortedWord)) map.put(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(s);
            // System.out.println(map);
        }

        return new ArrayList(map.values());

    }
}
