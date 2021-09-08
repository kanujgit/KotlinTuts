package com.codingchallanges.geeks.recursion;

public class JosephusProblem_KilledKthPerson {
    public static void main(String[] args) {
        int n = 3;
        int k = 6;
        System.out.println(josephusIfIndexStartFromOne(n, k));
    }

    private static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephus(n - 1, k) + k) % n;
    }
    private static int josephusIfIndexStartFromOne(int n, int k) {
        return josephus(n,k)+1;
    }


}
