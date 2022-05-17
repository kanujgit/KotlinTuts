package com.codingquestion.tree;

import java.util.TreeSet;

public class FindKthSmallestElement {
    int count = 0;
    public static void main(String[] args) {
        int[] arr = new int[]{50,20,10,40,100,70,60,80};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr)
            set.add(i);
        printKthSmall(set,3);
    }

    private static void printKthSmall(TreeSet<Integer> set, int k) {
        if(set == null) return;

    }
}
