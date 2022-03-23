package com.codingchallanges.geeks.array;

/**
 *   5-1  = 4
 *   12-3 = 9
 *   tot = 4+9 => 13
 *   draw a graph -> pic max and min point
 *
 */
public class StockProfitSolution {
    public static void main(String[] args) {
        int arr[] = {6,5,3,7,1,4};
        System.out.println(calculatePrice(arr, arr.length));
        maxProfit(arr,arr.length);
    }

    private static int calculatePrice(int[] arr, int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
    private static void maxProfit(int[] arr,int n){
        int profit =0;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            profit = Math.max((arr[i]-min),profit);
            min   = Math.min(arr[i],min);
        }
        System.out.println("Profit: "+ profit);
    }
}
