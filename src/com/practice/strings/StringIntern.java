package com.practice.strings;

public class StringIntern {

	public static void main(String[] args) {
		String hello = "Hello", lo = "lo";
		String s = "Hel" + lo;
		String s1 = "Hel" + "lo";
		System.out.print((hello == "Hello") + " ");
		System.out.print((Other.hello == hello) + " ");
		System.out.print((com.practice.strings.Other.hello == hello) + " ");
		System.out.print((hello == ("Hel" + "lo")) + " ");
		System.out.print((hello == ("Hel" + lo)) + " ");
		System.out.print((hello == s) + " ");
		System.out.print((hello == s1) + " ");
		System.out.println(hello == ("Hel" + lo).intern());
	}
}

class Other { static String hello = "Hello"; }
