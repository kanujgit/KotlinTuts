package com.codingquestion.queue;

import java.util.ArrayDeque;

public class ArrayDequeImpl {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.push(2);
        deque.add(3);
        System.out.println(deque.peek());
        System.out.println(deque);

    }
}
