package com.practice.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {7,5,4,2};
		int n = array.length;
		
		insertionSort(array, n);
		
	}
	
	private static void insertionSort(int[] array, int n) {
		
		for(int i = 0; i < n; i++) {
			int temp = array[i];
			int j = i;
			
			while(j > 0 && temp < array[j-1]) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		
		for(int i : array) {
			System.out.println(i);
		}
	}
}
