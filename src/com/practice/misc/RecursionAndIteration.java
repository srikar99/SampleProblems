package com.practice.misc;

public class RecursionAndIteration {

	static int[] resultArray;
	static int[] someArr = {1, 2, 3, 4, 5};
	public static void main(String[] args) {
		int fact = resursiveFactorial(2);
		System.out.println(fact);
		System.out.println(iterativeFactorial(6));
		//recursiveFibonacci(5);
		
		/*for(int i : resultArray) {
			System.out.println(i);
		}*/
		printArray(5);
	}

	private static int resursiveFactorial(int n) {
		int result = 1;
		if (n == 0 || n == 1) {
			return result;
		} else {
			result = n * resursiveFactorial(n - 1);
		}

		return result;
	}

	private static int iterativeFactorial(int n) {

		int result = 1;

		if (n == 0 || n == 1) {
			return 1;
		}

		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		return result;
	}

	private static int recursiveFibonacci(int n) {
		resultArray = new int[n];
		int result = 1;
		if(n > 2) {
			result = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
			resultArray[n - 1] = result;
		}
		return result;
	}
	
	private static void printArray(int n) {
		if(n == 0) {
			return;
		} else {
			printArray(n - 1);
			System.out.println(someArr[n - 1]);
		}
 	}
}
