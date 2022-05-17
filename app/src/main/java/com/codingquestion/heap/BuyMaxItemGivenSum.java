package com.codingquestion.heap;

import java.util.PriorityQueue;

public class BuyMaxItemGivenSum {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,2,5,2,11,321};
        int sum = 11;
        findMaxItem(arr,sum);
    }

    private static void findMaxItem(int[] arr, int sum) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int res =0;

        for (int i : arr)
            queue.add(i);
        System.out.println(queue);

        for(int i=0;i<arr.length;i++){
            if(sum >= queue.peek()){
                sum  = sum-queue.poll();
                res++;
            }else {
                break;
            }
        }
        System.out.println(queue);
        System.out.println(res);
    }
}
