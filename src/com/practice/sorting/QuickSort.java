package com.practice.sorting;

public class QuickSort {

	private static int[] array = { 5, 3, 1, 4, 2 };

	public static void main(String[] args) {
		quickSort(array, 0, array.length - 1);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private static int partition(int[] array, int start, int end) {
		int i = start + 1;
		int pivot = array[start];

		for (int j = start + 1; j <= end; j++) {

			if (array[j] < pivot) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;

				i += 1;
			}

			int temp = array[start];
			array[start] = array[i - 1];
			array[i - 1] = temp;
		}

		return i - 1;
	}

	private static int rand_partition(int A[], int start, int end) {
		// chooses position of pivot randomly by using rand() function .
		int random = (int) (start + Math.random() % (end - start + 1));

		int temp = array[random];
		array[random] = array[start];
		array[start] = temp;// swap pivot with 1st element.
		
		return partition(A, start, end); // call the above partition function
	}

	private static void quickSort(int[] array, int start, int end) {

		if (start < end) {
			int pivPos = rand_partition(array, start, end);
			quickSort(array, start, pivPos - 1);
			quickSort(array, pivPos + 1, end);
		}
	}
}
