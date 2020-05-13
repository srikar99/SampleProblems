package com.practice.arrays;

public class MonotoneArray {
	
	public static void main(String[] args) {
		int[] A = {1, 1, 0};
		System.out.println(isMonotonic(A));
	}

	public static boolean isMonotonic(int[] A) {

		boolean isMonotonic = false;
		boolean less = false;

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] <= A[i + 1]) {
				isMonotonic = true;
				if(A[i] < A[i+1]) {
					less = true;
				}
			} else if (A[i] >= A[i + 1] && !less) {
				isMonotonic = true;
			} else {
				isMonotonic = false;
				return isMonotonic;
			}
		}

		return isMonotonic;

	}
}
