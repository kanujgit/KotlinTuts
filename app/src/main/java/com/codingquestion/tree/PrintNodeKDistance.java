package com.codingquestion.tree;


import java.util.Arrays;

public class PrintNodeKDistance {

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            this.key = item;
            left = right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        int k = 2;
        printKDist(root, k);
        System.out.println(root);
    }

    private static void printKDist(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.println("data = " + root.key);

        printKDist(root.right, k - 1);
        printKDist(root.left, k - 1);
    }
}
