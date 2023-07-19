package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;

//O(V+E)
public class DFSDemoWithNoSourceNodeUndirected {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 6);
        addEdge(adj, 4, 6);

        System.out.println("Following is Depth First Traversal: ");
        DFS(adj, V);
        System.out.println();
    }

    private static void DFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        // graph is connected and source node is given
        //dfsRec(adj,s,visited);

        // graph is connected and source node is not given
        for (int i = 0; i < v; i++) {
            if (!visited[i])
                dfsRec(adj, i, visited);
        }

    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                dfsRec(adj, u, visited);
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
