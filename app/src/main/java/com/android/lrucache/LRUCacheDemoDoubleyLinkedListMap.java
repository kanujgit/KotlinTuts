package com.android.lrucache;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheDemoDoubleyLinkedListMap {

    public static void main(String[] args) {
        int capacity = 5;
        LRUCache obj = new LRUCache(capacity);
        obj.put(1, 11);
        obj.put(2, 12);
        obj.put(3, 13);
        obj.put(3, 14);
        obj.put(4, 15);
        obj.put(4, 16);
        obj.put(4, 17);
        obj.put(7, 17);
        obj.put(8, 17);

        obj.print();

        //8 7 4 3 2 1
    }

    static class LRUCache {

        Node head = new Node(0, 0), tail = new Node(0, 0);
        Map<Integer, Node> map = new HashMap();
        int capacity;

        public LRUCache(int _capacity) {
            this.capacity = _capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                insert(node);
                return node.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {

            if (map.containsKey(key)) {
                remove(map.get(key));
            }
            if (map.size() == capacity) {
                remove(tail.prev);
            }
            insert(new Node(key, value));

        }

        private void remove(Node node) {
            map.remove(node.key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insert(Node node) {
            map.put(node.key, node);
            node.next = head.next;
            node.next.prev = node;
            head.next = node;
            node.prev = head;
        }


        public void print() {

            LinkedList<Integer> list = new LinkedList<>(map.keySet());
            Iterator<Integer> itr = list.descendingIterator();
            while (itr.hasNext()){
                System.out.print(itr.next() + " ");
            }

        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class Node {
        Node prev, next;
        int key, value;

        public Node(int _key, int _value) {
            this.key = _key;
            this.value = _value;
        }
    }
}
