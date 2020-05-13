package com.practice.misc;

public class RecursionAndIteration {

	static int[] resultArray;
	static int[] someArr = {1, 2, 3, 4, 5};
	public static void main(String[] args) {
		int fact = resursiveFactorial(2);
		//System.out.println(fact);
		//System.out.println(iterativeFactorial(6));
		System.out.println(recursiveFibonacci(9));
		System.out.println(nonRecursiveFibonacci(9));
		System.out.println(nonRecursiveFibonacciArray(9));
		/*for(int i : resultArray) {
			System.out.println(i);
		}*/
		//printArray(5);
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

	private static void printArray(int n) {
		if(n == 0) {
			return;
		} else {
			printArray(n - 1);
			System.out.println(someArr[n - 1]);
		}
 	}
	
	private static int recursiveFibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		
		int s = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
		
		return s;
	}
	
	private static int nonRecursiveFibonacci(int n) {
		int a = 0, b = 1, c = 0;
		
		if(n == 1) {
			return a;
		}
		
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}
	
	private static int nonRecursiveFibonacciArray(int n) {
		int[] fib = new int[n+2];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		//printArray(n - 1);
		return fib[n];
		
	}
}
