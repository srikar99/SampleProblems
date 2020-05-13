package com.practice.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class VersionInformatica implements Comparator<String> {

	public static void main(String[] args) {

		String[] list = { "1.2.34", "$5.j8", "3.4#", "3.45", "2.1.4" };
		String regex = "([^\\d*\\.*])";

		for(int i = 0; i < list.length; i++) {
			list[i] = list[i].replaceAll(regex, "");
		}

		sortVersion(list);

		for (String s : list) {
			System.out.println(s);

		}

	}

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

	private static void sortVersion(String[] list) {
		Collections.sort(Arrays.asList(list), new VersionInformatica());
	}
}
