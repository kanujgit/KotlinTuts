package com.codingquestion.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumber {
    public static void main(String[] args) {
        int n =14;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        for (int i = 0; i < n; i++) {
            String curr = queue.peek();
            System.out.print(curr+"\t");
            queue.poll();
            queue.offer(curr+"1");
            queue.offer(curr+"2");
            queue.offer(curr+"3");
        }
        System.out.println();
        //System.out.println(queue);
    }
}
