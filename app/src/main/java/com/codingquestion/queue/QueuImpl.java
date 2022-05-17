package com.codingquestion.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuImpl {
    public static void main(String[] args) {
        Queue<Integer> queue  = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(4);
//        queueUsingArray();
//        queueUsingLinked();
        queueReverse(queue);

    }

    private static void queueReverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.poll());

        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println("reverse queue = "+queue);
    }

    private static void queueUsingLinked() {
        Queue<Integer> queue  = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(null);

        System.out.println(queue);
        queue.remove();
        queue.poll();
        System.out.println(queue);
        System.out.println("peek = " +queue.peek());
    }

    private static void queueUsingArray() {
        Queue<Integer> queue  = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}
