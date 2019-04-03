package com.practice.challenges;

public class PrintStars {

	public static void main(String[] args) {
		int n = 5;
		printStarInTriangle(n);
		System.out.println();
		printStarPyaramid(n);
		System.out.println();
		printStarReversePyaramid(n);
		System.out.println();
		printStarInvertedPyaramid(n);
	}

	private static void printStarInTriangle(int n) {
		for (int i = 0; i < n; i++) {

			for (int k = n - 1; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printStarPyaramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private static void printStarReversePyaramid(int n) {
		for (int i = 0; i < n; i++) {
			
			for (int j = n; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void printStarInvertedPyaramid(int n) {
		for (int i = 0; i < n; i++) {
			
			for(int k = n - 1; k >= i; k--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
