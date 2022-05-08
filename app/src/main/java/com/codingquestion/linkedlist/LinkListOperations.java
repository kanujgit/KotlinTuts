package com.codingquestion.linkedlist;

public class LinkListOperations {
    Node head;

   static class Node{
        Node next;
        int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head,3);
        head = insertBegin(head,2);
        head = insertBegin(head,1);
        head = insertEnd(head,4);
        printList("list",head);
        head = deleteFirstNode(head);
        printList("deleteFirstNode",head);
        head = deleteLastNode(head);
        printList("deleteLastNode", head);
        head = insertAtPosition(head,4,4);
        head = insertAtPosition(head,1,1);
        printList("insertAtPosition", head);
        int position = searchItemLinkedList(head,0);
        System.out.println("Found key at = "+position);

    }

    private static void printList(String status ,Node head) {
        System.out.print(status+" : ");
        Node curr=head;
        while(curr!=null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static Node insertBegin(Node head, int data) {
        Node  node = new Node(data);
        node.next = head;
        return node;
    }

    private static Node insertEnd(Node head, int data){
       Node node = new Node(data);
       Node curr = head;
       if(head == null)
           return node.next;
       while (curr.next!=null){
           curr  = curr.next;
       }

       curr.next= node;
       node.next =null;
       return head;
    }

    private static Node insertAtPosition(Node head, int pos, int val){
       Node  tmp = new Node(val);
       int index = 0 ;
       if(pos == 1) {
            tmp.next = head;
            return tmp;
       }
       Node curr = head;
        for (int i = 1; i <pos-2 && curr!=null ; i++) {
            curr = curr.next;
        }
        if(curr == null)
            return head;

        tmp.next = curr.next;
        curr.next = tmp;
        return head;
    }

    private static int searchItemLinkedList(Node head, int key){
       if(head == null) return  -1;
       Node curr = head;
       int index = 0;
       while (curr.next!=null) {
           index++;
           if(curr.data == key)
               return index;
           curr = curr.next;
       }
       return  -1;
    }

    private static Node deleteFirstNode(Node head){
        if(head == null) return null; else return head.next;
    }

    private static Node deleteLastNode(Node head){
       if(head == null) return null;

       if(head.next.next == null) return null;

       Node traversal = head;
       while (traversal.next.next!=null) {
           traversal = traversal.next;
       }

       traversal.next= null;
       return head;
    }

}
