package com.kdroid.kotlintuts.codingquestion.arrays;

public class SpirelMatrix {

	// Driver Code
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 },
					{ 5, 6, 7, 8 }, 
					{ 9, 10, 11, 12 },
					{ 13, 14, 15, 16 },
					{ 17, 18, 19, 20 } };

		// Function Call
		print(a, 0, 0, 4, 5);
	}

	// Function for printing matrix in spiral
	// form i, j: Start index of matrix, row
	// and column respectively m, n: End index
	// of matrix row and column respectively
	/**{ { 1, 2, 3, 4 },
		{ 5, 6, 7, 8 }, 
		{ 9, 10, 11, 12 },
		{ 13, 14, 15, 16 } };
		*/

	static void print(int arr[][], int r, int c, int m, int n) {

		//int k = 0;
		for (int i = r; i < m; i++) {
			System.out.print(arr[r][i]+" ");
		}
		System.out.print(" ");
		//k=m-1;
		for (int i = r+1; i < m; i++) {
			System.out.print(arr[i][m-1]+" ");
		}
		System.out.print(" ");
		//k=n-1;
		for (int i = n-1; i >=0; i--) {
			System.out.print(arr[n-1][i]+" ");
		}
		
		System.out.print(" ");
		//k=n-2;
		for (int i = 0; i <=n-2; i++) {
			System.out.print(arr[n-2][i]+" ");
		}

	}
}
