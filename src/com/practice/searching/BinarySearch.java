package com.practice.searching;

import com.practice.sorting.BubbleSort;

public class BinarySearch {
	static int[] array = { 31, 12, 22, 44, 98, 11, 34, 55, 77, 43, 13, 54, 98 };

	public static void main(String[] args) {

		int low = 0;
		int high = array.length - 1;

		BubbleSort.sort(array);

		System.out.println(binarySearch(low, high, 13));
	}

	public static int binarySearch(int low, int high, int key) {

		while (low <= high) {
			int mid = (low + high) / 2;
			if(array[mid] < key) {
				low = mid + 1;
			} else if(array[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
