package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;

//O(v+e)
public class DFSDemo {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,3,4);

        System.out.println("Following is Depth First Traversal: ");
        DFS(adj,V,0);
        System.out.println();
    }

    private static void DFS(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[v];
        Arrays.fill(visited,false);
        // graph is connected and source node is given
        //dfsRec(adj,s,visited);

        // graph is connected and source node is not given
        for (int i = 0; i < v; i++) {
            if(!visited[i])
              dfsRec(adj,i,visited);
        }

    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s+" ");
        for (int u:adj.get(s)) {
            if(!visited[u]){
                dfsRec(adj,u,visited);
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
