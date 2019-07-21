package com.practice.strings;

public class StringManupulation {

	public static void main(String[] args) {
		String s = "ooneefspd";
		int k = 4;
		// answer should be fspdoonee
		shiftLetter(s, k);
	}
	
	private static void shiftLetter(String s, int k) {
		
		String shiftedString = "";
		
		for(int i = s.length() - k; i < s.length(); i++) {
			shiftedString += s.charAt(i); 
		}
		shiftedString += s.substring(0, s.length() - k);
		
		System.out.println(shiftedString);
	}
}
