package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//O(V+E)
//space()
public class ShortestPathUnweightedUnDirecGraphBFS {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,0,2);
        addEdge(adj,1,3);

        System.out.println("Distance is :");
        BFSDistance(adj,v);

    }

    private static void BFSDistance(ArrayList<ArrayList<Integer>> adj,int v) {
        boolean visited[]  = new boolean[v];
        int dis[] = new int[v];
        Arrays.fill(visited,false);
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0] = 0;
        calDistance(adj,v,0,visited,dis);
        System.out.println(Arrays.toString(dis));
    }

    private static void calDistance(ArrayList<ArrayList<Integer>> adj, int v, int source, boolean[] visited, int[] dist) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[source] = true;
        queue.add(source);
        while (!queue.isEmpty()){
            int data = queue.poll();
            for (int u : adj.get(data)){
                if(!visited[u]){
                    visited[u] = true;
                    dist[u] = dist[data]+1;
                    queue.add(u);
                }
            }
        }
    }


    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
