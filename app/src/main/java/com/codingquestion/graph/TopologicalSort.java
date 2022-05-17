package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj,V);
        System.out.println();
    }

    private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] inDegree=  new int[v];
        for (int i = 0; i < v; i++) {
            for (int x: adj.get(i))
                inDegree[x]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if(inDegree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u +" ");
            for (int x: adj.get(u)) {
                if(--inDegree[x] == 0)
                    queue.add(x);
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(u).add(v);
    }
}
