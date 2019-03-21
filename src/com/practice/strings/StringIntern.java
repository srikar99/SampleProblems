package com.practice.strings;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2.intern();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
