package com.practice.hackerearth.arrays;

public class MaxOfKSizeSubArray {

	
	public static void main(String[] args) {
		maxOfKSizeSubArray(new int[] {1, 2, 3, 1, 4, 5, 2, 3, 6}, 3);
	}
	
	private static void maxOfKSizeSubArray(int[] N, int k) {
		int[] M = new int[k];
		int idx = 0;
		int max = 0;
		
		for(int i = idx; i < idx + k && idx + k <= N.length; i++) {
			for(int j = 0; j < M.length && idx + j <= N.length; j++) {
				M[j] = N[idx + j];
				if(max < M[j]) {
					max = M[j];
				}
			}
			idx++;
			System.out.println(max);
		}
	}
 }
