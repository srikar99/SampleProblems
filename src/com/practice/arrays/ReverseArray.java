package com.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		List<int[]> list = null;
		if(array != null && array.length !=0) {
			list = Arrays.asList(array);
			System.out.println(list);
		}
		
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
