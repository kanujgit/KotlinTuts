package com.codingquestion.linkedlist;

public class PalindromLinkListString {
    Node head;

    public static void main(String[] args) {
        PalindromLinkListString list = new PalindromLinkListString();
        list.head = new Node("a");
        list.head.next = new Node("bc");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("dcb");
        list.head.next.next.next.next = new Node("a");

        System.out.println(list.isPalindrome());
    }

    private boolean isPalindrome() {
        Node node = head;
        String str = "";
        while (node != null) {
            str = str.concat(node.data);
            node = node.next;
        }
        return isPalindromString(str);
    }

    private boolean isPalindromString(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            next = null;

        }
    }

}
