package com.codingquestion.amazon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class HeaviestWeight {
    public static void main(String[] args) {
        int arr[] = {20,13,8,9};
        List<Integer> list= new ArrayList<>();
        list.add(20);
        list.add(13);
        list.add(8);
        list.add(9);
        System.out.println(maxPackage(list));

    }

    public  static long maxPackage(List<Integer>  packageWeights) {
        Deque<Long> finalPack = new ArrayDeque<>();
        int n  = packageWeights.size()-1;
        finalPack.offerFirst(Long.valueOf(packageWeights.get(n)));
        long max = finalPack.peekFirst();

        for (int i = n-1; i >= 0; i--) {
            if (packageWeights.get(i) < finalPack.peekFirst()) { // merge with package on the right
                finalPack.offerFirst(finalPack.pollFirst() + packageWeights.get(i));
            } else { // cannot merge with package on the right
                finalPack.offerFirst(Long.valueOf(packageWeights.get(i)));
            }
            max = Math.max(max, finalPack.peekFirst());
        }

        return max;
    }
}
