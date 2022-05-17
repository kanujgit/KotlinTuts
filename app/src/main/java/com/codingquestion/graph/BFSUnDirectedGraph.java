package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUnDirectedGraph {
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
        BFSDistance(adj,V);
        System.out.println();
    }

    private static void BFSDistance(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean [] visited = new boolean[V];
        Arrays.fill(visited,false);
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                BFS(adj,i,visited);
            }
        }
        
    }

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

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
