package com.java.collections.linkedlist;

public class CircularLinkedList {
    private static Node push(Node head, int data) {
        Node ptr1 = new Node();
        Node tmp = head;
        ptr1.data = data;
        ptr1.next = head;

        if (head != null) {
            while (tmp.next != head) {
                tmp = tmp.next;
            }
            tmp.next = ptr1;
        } else {
            ptr1.next = ptr1;
        }
        head = ptr1;
        return head;
    }

    private static void printList(Node head) {
        Node tmp = head;
        if (head != null) {
            do {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            } while (tmp != head);
        }
    }

    public static void main(String[] args) {
        /* Initialize lists as empty */
        Node head = null;

        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);
        System.out.println("Contents of Circular " +
                "Linked List:");
        printList(head);
    }

    public static class Node {
        int data;
        Node next;
    }
}
