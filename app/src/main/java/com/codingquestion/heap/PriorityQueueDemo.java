package com.codingquestion.heap;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.add(10);
        queue.add(20);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
    }
}
