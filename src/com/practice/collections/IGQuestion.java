package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class IGQuestion {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(100);
		intList.add(200);
		intList.add(5);
		intList.add(1);

		// sum for greater than 20 and adding 5%
		System.out.println(intList.stream().filter(item -> item > 20).mapToInt(i -> i + (i * 5/100)).sum());
		
	}
}
