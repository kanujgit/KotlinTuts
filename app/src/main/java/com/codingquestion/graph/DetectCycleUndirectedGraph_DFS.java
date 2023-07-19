package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;

//O(v+e)
public class DetectCycleUndirectedGraph_DFS {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        if (DFS(adj, V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");

    }

    private static boolean DFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);

        // graph is connected and source node is not given
        for (int i = 0; i < v; i++) {
            if (!visited[i])
                if (dfsRec(adj, i, visited, -1))
                    return true;
        }
        return false;

    }

    private static boolean dfsRec(ArrayList<ArrayList<Integer>> adj,
                                  int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int u : adj.get(s)) {
            if (!visited[u]) {
                if (dfsRec(adj, u, visited, s))
                    return true;
            } else if (u != parent) {
                System.out.println(u);
                return true;
            }
        }
        return false;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
