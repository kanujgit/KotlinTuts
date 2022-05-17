package com.codingquestion.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{11,22,33,44,55,232,1,4};
        int  k =4;
        findKthLargest(arr,k);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void findKthLargest(int[] arr, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int n =arr.length;
        for (int a: arr)
            queue.add(a);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if( i == k-1){
                res = queue.poll();
                break;
            }else {
                queue.poll();
            }
        }
        System.out.println("Kth largest = "+res);
    }
}
