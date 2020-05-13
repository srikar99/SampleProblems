package com.practice.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int[] arr1 = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		// int[] arr2 = { 1, 2, 5, 6, 7, 8, 9, 10 };
		System.out.println(findMissingNumnber(arr1));
		System.out.println(findMissingNumnber1(arr));
	}

	private static int findMissingNumnber(int[] arr) {
		int num = arr[0];

		int missingNumber = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				num++;
			} else {
				missingNumber = num;
			}
		}
		return missingNumber;
	}

	private static int findMissingNumnber1(int[] arr) {
		int n = arr.length;
		int total = (n + 1) * (n + 2) / 2;
		int sum = 0;
		int i = 0;
		for (i = 0; i < n; i++) {
			sum += arr[i];
		}

		return total - sum;
	}
}
