package com.practice.challenges;

public class InformaticaSeggregateArray {

	public static void main(String[] args) {
		int[] array = {6, 4, 6, 8, 1, 1, 1};
		seggregateArray(array);

		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void seggregateArray(int[] array) {
		int left = 0, right = array.length - 1;

		while (left < right) {
			
			while (array[right] % 2 == 0 && left < right) {
				right--;
			}
			
			while ((array[left] & 1) == 1 && left < right) {
				left++;
			}
			
			if (left < right) {
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				
				left++;
				right--;
			}
		}
	}

}
