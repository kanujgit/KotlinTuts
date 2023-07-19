package com.codingquestion.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Critical Connections in a Network
 * https://leetcode.com/problems/critical-connections-in-a-network/
 * There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections
 * forming a network where connections[i] = [ai, bi] represents a connection between servers ai and bi.
 * Any server can reach other servers directly or indirectly through the network.
 * A critical connection is a connection that, if removed, will make some servers unable to reach some
 * other server.
 * Return all critical connections in the network in any order.
 * Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
 * Output: [[1,3]]
 * Explanation: [[3,1]] is also accepted.
 */
public class CriticalConnectionNetwork {
    public static void main(String[] args) {
    }
}
class Solution {
    private List<Integer>[] G;
    private List<List<Integer>> result = new ArrayList<>();
    private boolean[] visited;
    private int depth = 0;
    private int[] label,low;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        visited = new boolean[n];
        label = new int[n];
        low = new int[n];
        G = new ArrayList[n];

        for(int i=0;i<n;i++)
            G[i] = new ArrayList<>();

        for(List<Integer> edge : connections){
            int i = edge.get(0);
            int j = edge.get(1);

            G[i].add(j);
            G[j].add(i);
        }

        dfs(connections,0,-1);
        return result;
    }

    private void dfs(List<List<Integer>> connections,int node,int parent){
        visited[node] = true;
        label[node] = depth;
        low[node] = depth++;

        for(int neighbour : G[node]){
            if(parent == neighbour)
                continue;

            if(!visited[neighbour]){
                dfs(connections,neighbour,node);

                low[node] = Math.min(low[node],low[neighbour]);

                if(label[node]< low[neighbour]){
                    result.add(Arrays.asList(node,neighbour));
                }
            }else{
                low[node] = Math.min(low[node],low[neighbour]);
            }
        }

    }
}
