package com.codingquestion.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.right.left=new Node(40);
        tree.root.right.right=new Node(50);

//        tree.root = new Node(7);
//        tree.root.left = new Node(5);
//        tree.root.right = new Node(1);
//        tree.root.left.left = new Node(8);
//        tree.root.left.right = new Node(3);
//        tree.root.left.right = new Node(6);
//        tree.root.left.right = new Node(0);
//        tree.root.left.right = new Node(9);
//        tree.root.left.right = new Node(4);
//        tree.root.left.right = new Node(2);

        System.out.println(" Height of Tree = " + tree.heightOfBst(tree.root));
        System.out.println(" size of Tree = " + tree.sizeOfBst(tree.root));
        System.out.println(" max  of Tree node = " + tree.maximumOfBinaryTree(tree.root));
        System.out.println(" Left sub Tree = ");
        new PrintLeftSubTree().printLeftSubTree(tree.root);
        System.out.println();
        System.out.println("children sum = " +new ChildrenSumProperty().childrenSumProperty(tree.root));

        //System.out.println("Lever order traversal");
        //tree.levelOrderTraversal(tree.root);

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
//
//
//        System.out.println(
//                "\nInorder traversal of binary tree is ");
//        tree.printInOrder(tree.root);
//        System.out.println(
//                "\nInorder traversal of binary tree is iterative ");
//        tree.inOrderIterative(tree.root);
//
//
//        System.out.println();
//
//
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
        if (root == null) {
            return;
        }
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();
            System.out.print(node.key + " ");
            stack.pop();

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public void inOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null)
            return;

        Node current = root;
        while (current != null || stack.size() > 0) {
            while (current != null) {
                stack.push(current);
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            current = current.right;
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

    public int heightOfBst(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(heightOfBst(root.left), heightOfBst(root.right)) + 1;
        }
    }

    public int sizeOfBst(Node root) {
        if (root == null) {
            return 0;
        } else {
            return (sizeOfBst(root.left) + 1) + (sizeOfBst(root.right) + 1);
        }
    }

    public int maximumOfBinaryTree(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(root.key, Math.max(maximumOfBinaryTree(root.left), maximumOfBinaryTree(root.right)));
        }
    }

    public void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null)
                queue.add(curr.left);

            if (curr.right != null)
                queue.add(curr.right);
        }
        System.out.println();

    }
}

class PrintLeftSubTree {
    void printLeftSubTree(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if (i == 0)
                    System.out.print(root.key +" ");

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }
    }
}
class ChildrenSumProperty {
    boolean childrenSumProperty(Node root) {
        if (root == null) return true;
        if(root.right  == null && root.left == null) return true;
        int sum = 0;
        if(root.left!= null) sum = sum+root.left.key;
        if(root.right!= null)sum = sum+root.right.key;

        return (root.key == sum) && childrenSumProperty(root.left) && childrenSumProperty(root.right);
    }
}

