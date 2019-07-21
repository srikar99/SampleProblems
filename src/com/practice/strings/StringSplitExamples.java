package com.practice.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSplitExamples {

	public static void main(String[] args) {
		Set<String> keySet = new HashSet<>();
		keySet.add("LocationName");
		keySet.add("LocationSectorName");
		keySet.add("CountryName");

		String physicalName = "";
		String expression = "-LocationName = something AND LocationSectorName = somethingelse OR CountryName = testCountry";
		List<String> list = getFilterExpr(expression, keySet);

		String[] values1  = expression.split("\\s+");
		String[] values = expression.split(" = ");
		int odd = 1;
		for (int i = 0; i < values.length; i++) {
			if (i % 2 != 0) {
				odd = i;
				System.out.println(values[odd]);
			}

		}
		for (String token : list) {
			if (expression.contains(token)) {
				physicalName = "physical_Name_FROM_MAP";
				expression = expression.replace(token, physicalName.toLowerCase());
			}
		}

		System.out.println(expression);
	}

	private static List<String> getFilterExpr(String expression, Set<String> keySet) {
		String[] tokens = expression.split(" ");
		List<String> list = new ArrayList<>();

		for (String token : tokens) {
			for (String key : keySet) {
				if (token.contains(key)) {
					list.add(token);
				}
			}
		}

		return list;
	}
}
