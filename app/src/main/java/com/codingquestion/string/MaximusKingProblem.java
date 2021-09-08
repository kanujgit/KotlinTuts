package com.codingquestion.string;

public class MaximusKingProblem {

	public static void main(String[] args) {
		int[] states = { 3, 4, 5,10,10,10,10,10 ,10};
		int maxSum[] = new int[states.length];
		for (int i = 0; i < states.length; i++) {
			maxSum[i] = totalSum(i, states);
		}
	
		int max = maxSum[0];
		int index=0;
		for(int i=0;i<maxSum.length;i++) {
			if (max < maxSum[i]) {
				max = maxSum[i];
				index = i;
			}
		}
		System.out.println(max+" "+(index+1));
		
	}

	private static int totalSum(int i, int[] state) {
		int leftSum = 0;
		int RightSum = 0;
		int j = i;
		if (state.length > j + 2) {
			RightSum += state[j + 1] + state[j + 2];
		} else if (state.length > j + 1) {
			RightSum += state[j + 1];
		} else if (state.length == j) {
			RightSum = 0;
		}
		if (i == 0) {
			leftSum = 0;
		} else if (i == 1) {
			leftSum += state[i - 1];
		} else if (i >= 0) {
			leftSum += state[i - 1] + state[i - 2];
		}
		System.out.println("j=" + j + " i=" + i + " leftSum=" + leftSum + " rightSum=" + RightSum+" total sum="+(leftSum+RightSum));

		return leftSum + RightSum;
	}

}
