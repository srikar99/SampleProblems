package com.practice.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {7, 5, 4, 2};
		
		selectionSort(array);
		
	}

	private static void selectionSort(int[] array) {
		
		// temp variable to store minimum value
		int minimum;
		
		for(int i = 0; i < array.length - 1; i++) {
			// assume minimum is at first position
			minimum = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[minimum]) {
					minimum = j;
				}
				
				int temp = array[minimum];
				array[minimum] = array[i];
				array[i] = temp;
			}
		}
		
		for(int i : array) {
			System.out.println(i);
		}
	}

}
