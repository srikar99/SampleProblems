package com.practice.arrays;

public class MultiplyArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(multiply(arr, 1, 0));
	}

	public static int multiply(int[] nums, int p, int n) {
		return (n == nums.length) ? 1
				: nums[n] * (p = multiply(nums, nums[n] * (nums[n] = p), n + 1)) + 0 * (nums[n] *= p);
	}
}
