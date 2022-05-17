package com.codingquestion.linkedlist;

public class DoublyLinkedOperations {

    static class Node{
        int data;
        Node next,prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node tmp1 = new Node(2);
        Node tmp2 = new Node(3);
        head.next = tmp1;
        tmp1.prev = head;
        tmp1.next = tmp2;
        tmp2.prev =tmp1;
        printList(head);
        head = insertAtBegin(head,0);
        printList(head);
        head = insertAtEnd(head,4);
        printList(head);
        head = reverseList(head);
        printList(head);
        head = deleteFirstNode(head);
        printList(head);
        head = deleteLastNode(head);
        printList(head);

    }

    private static Node insertAtBegin(Node head, int d) {
        Node newNode = new Node(d);
        if(head == null) return newNode;
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    private static Node insertAtEnd(Node head, int d) {
        Node newNode = new Node(d);
        if(head == null) return newNode;
        Node curr = head;
        while (curr.next!=null)
            curr = curr.next;

        newNode.prev = curr;
        curr.next = newNode;
        return head;
    }

    private static Node deleteFirstNode(Node head){
        if(head == null || head.next == null) return null;

        Node curr = head;
        curr = curr.next;
        curr.prev = null;
        return curr;
    }

    private static Node deleteLastNode(Node head){
        if(head == null || head.next == null) return null;

        Node curr = head;
        while (curr.next!= null)
            curr = curr.next;

        curr.prev.next = null;
        return head;
    }
    private static Node reverseList(Node head){
        if(head == null || head.next==null) return  head;
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            prev =  curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr  = curr.prev;
        }
        return prev.prev;
    }

    static void printList(Node node){
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}
