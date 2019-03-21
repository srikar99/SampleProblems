package com.practice.arrays;

public class HackerEarthFredo {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5};
		System.out.println(lowestNum(inputArray));
	}
	
	private static int lowestNum(int[] inputArray) {
		int result = 0;
		int originalSum = 0;
		
		for(int i = 0; i < inputArray.length; i++) {
			originalSum += inputArray[i];
		}
		
		for(int i = 1; i <= inputArray.length; i++) {
			if(i * inputArray.length > originalSum) {
				return i;
			}
		}
		
		return result;
	}
}
