package com.practice.hackerearth.arrays;

// find the number of different groups in an array separated by max number
public class AtmQueue {

	public static void main(String[] args) {
		countGroups(new int[]{1, 2, 3, 4, 3, 4, 5, 6, 7});
	}
	
	// groups have incremental heights
	private static void countGroups(int[] heights) {
		int max = 1;
		
		for(int i = 0; i < heights.length - 1; i++) {
			if(heights[i] > heights[i + 1]) {
				max++;
			}
		}
		
		System.out.println(max);
	}
}
