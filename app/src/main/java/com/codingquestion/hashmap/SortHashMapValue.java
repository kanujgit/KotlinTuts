package com.codingquestion.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMapValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        System.out.println(hm);
        Map<String, Integer> hm1 = sortByValue(hm);
//        for (Map.Entry<String, Integer> entry : hm1.entrySet()) {
//            System.out.print(entry.getKey() + " " + entry.getValue() + " , ");
//        }
        System.out.println(hm1);
    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> tmp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> map : list) {
            tmp.put(map.getKey(), map.getValue());
        }
        return tmp;
    }
}
