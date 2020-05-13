package com.practice.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a list of positive integers nums and an int target, return indices of
 * the two numbers such that they add up to a target - 30.
 * <ul>
 * Conditions:
 * <ol>
 * You will pick exactly 2 numbers.
 * </ol>
 * <ol>
 * You cannot pick the same element twice.
 * </ol>
 * <ol> If you have muliple pairs, select the pair with the largest number. </ol>
 * </ul>
 * 
 * @author shreekar.pujari
 *
 */
public class AmazonArraySum {

	public static void main(String[] args) {
		int target = 90;
		int[] arr = {1, 10, 25, 35, 60};
		int[] arr1 = {20, 50, 40, 25, 30, 10};
		
		calculateSum(arr, target);
		calculateSum(arr1, target);
	}
	
	private static void calculateSum(int[] arr, int target) {
		
		int n = arr.length;
		int count = 0;
		List<int[]> pairs = new ArrayList<>();
		int[] pair = new int[n];
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] + arr[j] == (target - 30)) {
					pair[count] = arr[i];
					pair[count++] = arr[j];
					pairs.add(pair);
				}
			}
		}
		
	}
}
