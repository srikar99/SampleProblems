package com.practice.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = {4, 12, 7, 15, 9};
		reverseArray(array);
	}

	private static void reverseArray(int[] array) {
		int[] returnArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			returnArray[i] = array[array.length - 1 - i];
		}
		
		for(int val : returnArray) {
			System.out.println(val);
		}
	}
}
