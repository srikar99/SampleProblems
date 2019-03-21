package com.practice.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringPractice {

	public static void main(String[] args) {

		equalityOperations();
		countEachCharInString("asdfasdfaaab");
		System.out.println(checkIfPalindrome("ABBA"));
		checkDuplicates("asdfasdfaaab");
		removeWhiteSpace("s t r i n g");
		reverse("test");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ab").append("cd");
		
		System.out.println(sb.toString());
		System.out.println(new String(sb));
		
		String s1 = "abcd";
		String s2 = "ghAB";
		
		boolean b = s1.regionMatches(true, 0, s2, 2, 2);
		System.out.println(b);
		
		StringBuffer sBuf = new StringBuffer();
		sBuf.append("String").append("Buffer");
		System.out.println(sBuf.toString());
		System.out.println(new String(sBuf));
		
		int i = 10;
		
		String valueOfVar = String.valueOf(i);
		
		Integer in = new Integer(10);

		String toStrignVar = in.toString();
		
		System.out.println(valueOfVar + " " + toStrignVar);
		
		System.out.println(new String(Integer.toString(11)));
	}

	private static void equalityOperations() {
		String s1 = "abc";
		String s2 = new String("abc").intern();
		String s3 = "abc";

		if (s1 == s2) {
			System.out.println("true");
		}
		if (s1 == s3) {
			System.out.println("true");
		}
	}

	private static void countEachCharInString(String s) {
		Map<Character, Integer> countMap = new HashMap<>();
		char[] strArray = s.toCharArray();

		for (char a : strArray) {
			if (countMap.containsKey(a)) {
				countMap.put(a, countMap.get(a) + 1);
			} else {
				countMap.put(a, 1);
			}
		}

		for (Entry<Character, Integer> map : countMap.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}

	private static boolean checkIfPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (sb.reverse().toString().equals(s)) {
			return true;
		}
		for (int i = 0; i < s.length() / 2; ++i) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return false;
	}

	private static void checkDuplicates(String s) {
		Map<Character, Integer> countMap = new HashMap<>();
		char[] strArray = s.toCharArray();

		for (char a : strArray) {
			if (countMap.containsKey(a)) {
				countMap.put(a, countMap.get(a) + 1);
			} else {
				countMap.put(a, 1);
			}
		}

		Set<Character> charset = countMap.keySet();

		for (char c : charset) {
			if (countMap.get(c) > 1) {
				System.out.println(c + ":" + countMap.get(c));
			}
		}
	}

	private static void removeWhiteSpace(String s) {
		String str = "";
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (!Character.isWhitespace(arr[i])) {
				str += arr[i];
			}
		}

		System.out.println(str);
	}

	private static void reverse(String s) {
		StringBuilder sb = new StringBuilder();
		String reverseString = new String(sb.append(s).reverse());
		String sBuf = new StringBuffer(s).reverse().toString();
		String revString = "";
		char[] arr = s.toCharArray();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			revString += arr[i];
		}
		
		System.out.println(revString);
		System.out.println(reverseString);
		System.out.println(sBuf);
	}
}
