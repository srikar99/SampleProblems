package com.practice.hackerearth.arrays;

// problem: to find count of the number given in an array
public class MemorizeMe {

	public static void main(String[] args) {
		int[] numArray = { 1, 2, 1, 0, 3, 4 };
		int[] arr = { 1, 1, 1, 2, 2, 0 };

		for (int i = 0; i < numArray.length; i++) {
			countNumber(arr, numArray[i]);
		}
	}

	private static int countNumber(int[] arr, int number) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (number == arr[i]) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Not Present");
		} else {
			System.out.println(count);
		}
		return count;
	}
}
