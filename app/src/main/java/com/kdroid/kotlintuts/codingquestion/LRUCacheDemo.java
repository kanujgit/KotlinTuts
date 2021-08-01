package com.kdroid.kotlintuts.codingquestion;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache ca = new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

}

class LRUCache {
    int cap;
    Set<Integer> cache;

    LRUCache(int cap) {
        this.cache = new LinkedHashSet<>(cap);
        this.cap = cap;
    }

    public boolean getKey(int key) {
        if (!cache.contains(key)) {
            return false;
        }
        cache.remove(key);
        cache.add(key);
        return true;
    }

    public void refer(int key) {
        if (getKey(key) == false) {
            put(key);
        }
    }


    private void put(int key) {
        if (cache.size() == cap) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
        cache.add(key);
    }


    // displays contents of cache in Reverse Order
    public void display()
    {
        LinkedList<Integer> list = new LinkedList<>(cache);

        // The descendingIterator() method of java.util.LinkedList
        // class is used to return an iterator over the elements
        // in this LinkedList in reverse sequential order
        Iterator<Integer> itr = list.descendingIterator();

        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }
}
