package com.practice.arrays;

public class HEIdentityPermutation {

	public static void main(String[] args) {
		int[] perm = { 2, 3, 1 };

		// calculateMinNumberOfStep(perm);
		int[] arr = sort(perm);

		for (int a : arr) {
			System.out.println(a);
		}
	}

	@SuppressWarnings("unused")
	private static int calculateMinNumberOfStep(int[] perm) {

		int[] sortedArray = sort(perm);
		int count = 0;
		for (int i = 0; i < perm.length; i++) {
			perm[i] = perm[perm[i]];
		}

		if (perm.equals(sortedArray)) {

		}

		return 0;
	}

	private static int[] sort(int[] perm) {

		for (int i = 0; i < perm.length - 1; i++) {
			for (int j = 0; j < perm.length - 1; j++) {
				if (perm[j] > perm[j + 1]) {
					perm[j] = perm[j] + perm[j + 1];
					perm[j + 1] = perm[j] - perm[j + 1];
					perm[j] = perm[j] - perm[j + 1];

				}
			}
		}
		
		return perm;
	}
}
