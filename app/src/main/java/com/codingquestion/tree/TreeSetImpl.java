package com.codingquestion.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("anuj");
        treeSet.add("an");
        treeSet.add("b");


        System.out.println(treeSet);

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String str: treeSet) {
            System.out.println(str);
        }
    }
}
