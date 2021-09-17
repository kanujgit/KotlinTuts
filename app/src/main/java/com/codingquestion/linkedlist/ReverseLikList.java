package com.codingquestion.linkedlist;

public class ReverseLikList {
    static Node head;

    public static void main(String[] args) {
        ReverseLikList list = new ReverseLikList();
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = reverse(head);
        System.out.println();
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    private Node reverseLoop(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
