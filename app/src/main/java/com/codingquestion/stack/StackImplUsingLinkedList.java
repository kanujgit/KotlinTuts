package com.codingquestion.stack;


public class StackImplUsingLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        System.out.println(stack.size);

    }

    static class MyStack{
        Node head;
        int size =0;

        public MyStack(int size) {
            this.head = null;
            this.size = 0;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            return  (head == null);
        }

        private  void push(int data){
            Node node = new Node(data);
            node.next = head;
            head = node;
            size++;
        }

        private int pop(){
            if(size<0) return -1;
            int res =head.data;
            head = head.next;
            size--;
            return res;
        }

        private int peek(){
            if(size<0) return -1;
            return  head.data;
        }
    }

}
