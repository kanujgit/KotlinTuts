package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// O(V+E)(vertices + edges)
public class BFSWithSourceNodeUnDirectedDemo {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,3,4);
        addEdge(adj,2,4);

        System.out.println("Following is Breadth First Traversal: ");
        BFS(adj,V,3);
        System.out.println();

    }

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited,false);
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u +" ");
            for (int v :adj.get(u)) {
                if(!visited[v]){
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
