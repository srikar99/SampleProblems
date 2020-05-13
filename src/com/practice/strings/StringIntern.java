package com.practice.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		System.out.print((hello == "Hel" + lo.intern()) + " ");
		System.out.print((hello == s) + " ");
		System.out.print((hello == s1) + " ");
		System.out.println(hello == ("Hel" + lo).intern());
		System.out.println(hello == (s).intern());
		
	}
}

class Other { static String hello = "Hello"; }
