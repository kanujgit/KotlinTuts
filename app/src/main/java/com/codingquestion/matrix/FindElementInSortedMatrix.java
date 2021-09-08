package com.codingquestion.matrix;

public class FindElementInSortedMatrix {
    public static void main(String[] args) {
        int mat[][] = {
                {
                        10, 20, 30, 40
                },
                {
                        15, 25, 35, 45
                },
                {
                        27, 29, 37, 48
                },
                {
                        32, 33, 39, 50
                }
        };
        search(mat, 4, 29);
        SearchByO_n_(mat, 4, 29);
    }

    private static void search(int[][] mat, int n, int searchElement) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == searchElement) {
                    System.out.println("i = " + i + " j = " + j);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    private static void SearchByO_n_(int[][] mat, int n, int searchElement) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (mat[i][j] == searchElement) {
                System.out.println("Element found of : " + i + " and j : " + j);
                return;
            }
            if (mat[i][j] > searchElement) {
                j--;
            } else {
                i++;
            }
        }
        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )

    }

}
