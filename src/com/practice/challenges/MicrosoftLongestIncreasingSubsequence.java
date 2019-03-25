package com.practice.challenges;

public class MicrosoftLongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
		System.out.println(lis(arr));
	}
	
	private static int lis(final int[] A) {
		int max = 0;
		
		int[] subArr = new int[A.length];
		
		for(int k = 0; k < A.length; k++) {
			subArr[k] = 1;
		}
		for(int i = 1; i < A.length; i++) {
			for(int j = 0; j < i; j++) {
				if(A[i] > A[j] && subArr[i] < subArr[j] + 1) {
					subArr[i] = subArr[j] + 1;
				}
			}
		}
		
		for(int i = 0; i < subArr.length; i++) {
			if(max < subArr[i]) {
				max = subArr[i];
			}
		}
		return max;
	}
}
