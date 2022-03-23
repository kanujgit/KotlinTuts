package com.codingquestion.linkedlist;

public class BasicLinkList<T> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkList(Node first) {
        this.first = null;
        this.last = null;
    }







    private class Node{
        private Node nextNode;
        private T nodeItem;

        public Node(T item){
            this.nextNode = null;
            this.nodeItem = item;
        }

        public void setNextNode(Node item){
            this.nextNode =item;
        }

        public Node getNextNode(){
            return nextNode;
        }

        public T getNodeItem(){
            return nodeItem;
        }

        
    }

}
