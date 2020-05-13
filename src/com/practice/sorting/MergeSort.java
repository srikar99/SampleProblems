package com.practice.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] A = { 4, 2, 5, 1, 7, 3, 9, 8 };
		merge_sort(A, 0, A.length - 1);
	}

	static void merge(int A[], int start, int mid, int end) {
		// stores the starting position of both parts in temporary variables.
		int p = start, q = mid + 1;

		int[] Arr = new int[mid - start + 1];
		
		int k = 0;

		for (int i = start; i <= end; i++) {
			if (p > mid) // checks if first part comes to an end or not .
				Arr[k++] = A[q++];

			else if (q > end) // checks if second part comes to an end or not
				Arr[k++] = A[p++];

			else if (A[p] < A[q]) // checks which part has smaller element.
				Arr[k++] = A[p++];

			else
				Arr[k++] = A[q++];
		}
		for (p = 0; p < k; p++) {
			/*
			 * Now the real array has elements in sorted manner including both parts.
			 */
			A[start++] = Arr[p];
		}
	}

	private static void merge_sort(int[] array, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			merge_sort(array, start, mid);
			merge_sort(array, mid + 1, end);

			merge(array, start, mid, end);
		}

	}
}
