package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//O(v+e)
public class DetectCycleUndirectedGraph_BFS {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,3,4);
        addEdge(adj,1,4);
        addEdge(adj,1,5);


        if (BFS(adj, V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");

    }

    private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        int[] parent = new int[v];
        Arrays.fill(parent,-1);

        // graph is connected and source node is not given
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if(BFSTraversal(adj,i,visited,parent)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean BFSTraversal(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited, int[] parent) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while (!queue.isEmpty()){
            int u = queue.poll();
            for (int v : adj.get(u)){
                if(!visited[v]){
                    visited[v] =true;
                    parent[v] = u;
                    queue.add(v);
                }else if(parent[u] != v){
                    System.out.println(Arrays.toString(new int[]{u,v}));
                    return true;
                }
            }
        }
        return false;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
