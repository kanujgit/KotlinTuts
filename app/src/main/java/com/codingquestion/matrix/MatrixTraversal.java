package com.codingquestion.matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraversal {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("silver");
        list1.add("pixel");
        items.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        items.add(list2);
        String ruleKey = "color";
        String ruleValue = "silver";
        int res = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")) {
                if (items.get(i).get(0) == ruleValue)
                    res++;
            } else if (ruleKey == "color") {
                if (items.get(i).get(1) == ruleValue) {
                    res++;
                }
            } else {
                if (items.get(i).get(2) == ruleValue)
                    res++;
            }
        }
        System.out.println("count " + res);
    }
}

