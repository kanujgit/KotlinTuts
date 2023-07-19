package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//[[0,1],[1,2],[2,0],[1,3]]
public class MakeAdjencncyList {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[][] mat = new int[][]{{0, 1}, {1, 2}, {2, 0}, {1, 3}};

        for (int[] arr : mat){
            lists.addAll(Collections.singletonList(Arrays.stream(arr).boxed().map(Integer::new).collect(Collectors.toList())));
            System.out.println(lists);
        }

        makeAdjacencyList(lists,4);
    }

    private static void makeAdjacencyList(List<List<Integer>> lists, int v) {
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(v);

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < lists.size(); i++) {
                addEdge(adj,lists.get(i).get(0),lists.get(i).get(1));
        }

        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }

}
