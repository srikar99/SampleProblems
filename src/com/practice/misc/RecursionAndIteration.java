package com.practice.misc;

public class RecursionAndIteration {

	public static void main(String[] args) {
		int fact = resursiveFactorial(2);
		System.out.println(fact);
		System.out.println(iterativeFactorial(6));
	}
	
	private static int resursiveFactorial(int n) {
		int result = 1;
		if(n == 0 || n == 1) {
			return result;
		} else {
			result = n * resursiveFactorial(n - 1);
		}
		
		return result;
	}
	
	private static int iterativeFactorial(int n) {
		
		int result = 1;
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		
		return result;
	}
}
