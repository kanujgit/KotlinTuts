package com.codingquestion.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeuImpl {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);

    }
}
