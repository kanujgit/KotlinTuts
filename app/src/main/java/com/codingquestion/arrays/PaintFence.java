package com.codingquestion.arrays;

import javax.xml.transform.Source;

public class PaintFence {
    // Function to find the minimum cost of
// coloring the houses such that no two
// adjacent houses has the same color
    static int minCost(int costs[][], int n) {

        int N = costs.length;
        // Corner Case
        if (N == 0)
            return 0;

        int color[][] = new int[N][3];

        // Base Case
        color[0][0] = costs[0][0];
        color[0][1] = costs[0][1];
        color[0][2] = costs[0][2];

        for (int i = 1; i < N; i++) {
            color[i][0] = Math.min(color[i - 1][1], color[i - 1][2]) + costs[i][0];
            color[i][1] = Math.min(color[i - 1][0], color[i - 1][2]) + costs[i][1];
            color[i][2] = Math.min(color[i - 1][0], color[i - 1][1]) + costs[i][2];
        }

        // Print the min cost of the
        // last painted house
        return
                Math.min(color[N - 1][0],
                        Math.min(color[N - 1][1], color[N - 1][2]));
    }

    // Driver code
    public static void main(String[] args) {

        int costs[][] = {{2,9,4},
                {20,7,15},
                {18,12,19}};

        int N = costs.length;

        // Function Call
        paint(costs, N);
        System.out.println(minCost(costs, N));
        //System.out.println( paint(costs, N));
    }


    public static void paint(int[][] times, int N){
        int n = N;
        if(n == 0)
            return ;

        int color[][] = new int[n][3];

        color[0][0] = times[0][0];
        color[0][1] = times[0][1];
        color[0][2] = times[0][2];

//        for(int i = 1 ;i<n; i++){
//            color[i][0] = Math.min(color[i-1][1], color[i-1][2])+color[i][0];
//            color[i][1] = Math.min(color[i-1][0], color[i-1][2])+color[i][1];
//            color[i][2] = Math.min(color[i-1][0], color[i-1][1])+color[i][2];
//        }

        for (int i = 1; i < N; i++) {
            color[i][0] = Math.min(color[i - 1][1], color[i - 1][2]) + color[i][0];
            color[i][1] = Math.min(color[i - 1][0], color[i - 1][2]) + color[i][1];
            color[i][2] = Math.min(color[i - 1][0], color[i - 1][1]) + color[i][2];
        }


        System.out.println( Math.min(color[N - 1][0],
                Math.min(color[N - 1][1], color[N - 1][2])));



//        int x=Math.min(color[n-1][0],color[n-1][1]);
//        int y=Math.min(color[n-1][2],x);
//        return y;
    }
}
