package com.codingquestion.tree;

import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(7);
        tree.root.left = new Node(5);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(3);
        tree.root.left.right = new Node(6);
        tree.root.left.right = new Node(0);
        tree.root.left.right = new Node(9);
        tree.root.left.right = new Node(4);
        tree.root.left.right = new Node(2);

//        System.out.println(
//                "Preorder traversal of binary tree is ");
//        tree.printPreOrder(tree.root);
//        System.out.println();
//        System.out.println(
//                "Preorder traversal of binary tree is iterative ");
//        tree.preOrderIterative(tree.root);
//
//
//        System.out.println();


        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInOrder(tree.root);
        System.out.println(
                "\nInorder traversal of binary tree is iterative ");
        tree.inOrderIterative(tree.root);


        System.out.println();


//        System.out.println(
//                "\nPostorder traversal of binary tree is ");
//        tree.printPostOrder(tree.root);
//        System.out.println(
//                "\nPostorder traversal of binary tree is  iterative");
//        tree.postOrderIterative(tree.root);
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");

        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    public void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }


    public void preOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        if(root==null){
            return;
        }
        stack.push(root);

        while (!stack.isEmpty()){
            Node node = stack.peek();
            System.out.print(node.key+" ");
            stack.pop();

            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
    }

    public void inOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null)
            return;

        Node current = root;
        while (current!=null || stack.size()>0){
            while (current!=null){
                stack.push(current);
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key+" ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            current =current.right;
        }

    }


    public void postOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }
            if (stack.isEmpty()) {
                return;
            }
            root = stack.pop();
            if (!stack.isEmpty() && stack.peek() == root) {
                root = root.right;
            } else {
                System.out.print(root.key + " ");
                root = null;
            }
        }
    }

}

