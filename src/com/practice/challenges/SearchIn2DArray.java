package com.practice.challenges;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] A = { 
						{ 10, 20, 30, 40 }, 
						{ 15, 25, 35, 45 }, 
						{ 27, 29, 37, 48 }, 
						{ 32, 33, 39, 50 } 
					};
		int k = 37;
		search(A, k);
		findMaxSum2DArray(A);
	}

	private static void search(int[][] a, int k) {
		int row = 0, col = a[0].length - 1;

		while (row < a[0].length && col >= 0) {
			if (a[row][col] == k) {
				System.out.println("(" + row + ", " + col + ")");
				return;
			} else if (a[row][col] > k) {
				col--;
			} else {
				row++;
			}
		}

		return;
	}

	private static void findMaxSum2DArray(int[][] A) {
		// start at beginning
		int row = 0, col = 0;
		int MAX_SUM = 0;
		int diaogonalSum = 0;

		for (int j = 0; j < A[1].length; j++) {
			int downSum = 0;
			for (int i = 0; i < A[0].length; i++) {
				if (col == i) {
					while (col <= A[1].length - 1 && row <= A[0].length - 1) {
						diaogonalSum += A[row][col];
						row++;
						col++;
					}
				}
				
				downSum += A[i][j];
				MAX_SUM = max(downSum, diaogonalSum);
			}
		}
		System.out.println(MAX_SUM);
	}

	static int max(int a, int b) {
		return a < b ? b : a;
	}
}
