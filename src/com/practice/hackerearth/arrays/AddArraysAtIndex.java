package com.practice.hackerearth.arrays;

public class AddArraysAtIndex {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		int[] B = {4, 5, 3, 2, 10};
		
		addArrays(A, B);
	}
	
	private static void addArrays(int[] A, int[] B) {
		
		for(int i = 0; i < A.length; i++) {
			A[i] = A[i] + B[i];
		}
		
		for(int i : A) {
			System.out.println(i);
		}
		
		A = null;
		B = null;
	}
}
