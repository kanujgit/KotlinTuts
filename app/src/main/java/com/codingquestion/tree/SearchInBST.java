package com.codingquestion.tree;

public class SearchInBST {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.left.key = 5;
        node.left.left.key = 3;
        node.right.key = 20;
        searchItem(node,5);
    }

    private static boolean searchItem(Node node, int i) {
        if(node == null) return false;
        else if(node.key == i) return  true;
        else if(node.key> i) return searchItem(node.left,i);
        else return searchItem(node.right,i);
    }

}
