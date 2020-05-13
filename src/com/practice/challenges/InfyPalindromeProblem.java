package com.practice.challenges;

public class InfyPalindromeProblem {

	public static void main(String[] args) {
		int number = 1111;
		int palindromeNumber = 0;
		int a = 0, m = 0;
		if (checkIfPalindrome(number)) {
			if (String.valueOf(number).length() % 2 == 0) {
				while (number > 0) {
					a = number % 10;
					a++;
					m = m * 10 + a;
					palindromeNumber = palindromeNumber * 10 + a;
					number = number / 10;
				}
			} else {
				char middle = String.valueOf(number).charAt(String.valueOf(number).length() / 2);
				int mid = Integer.parseInt(String.valueOf(middle));
			}
		}

		System.out.println(palindromeNumber);
	}

	private static boolean checkIfPalindrome(int integer) {

		// 123/10 = 12.3
		int reverseNumber = 0;
		int originalNumber = integer;

		while (integer > 0) {
			reverseNumber = reverseNumber * 10 + integer % 10;
			integer = integer / 10;
		}

		if (originalNumber == reverseNumber) {
			return true;
		}

		return false;
	}
}
