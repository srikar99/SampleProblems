package com.practice.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoogleMaxNonNegativeSubArray {

	//1059961393, 628175011, -1131176229, -859484421 
	static int max = 0;
	static List<Integer> result = new ArrayList<>();

	public static void main(String[] args) {
		Integer val = 1101513929 + 1315634022;
		System.out.println(val);
		List<Integer> list = new ArrayList<>();
		list.add(336465782);
		list.add(-278722862);
		list.add(-2145174067);
		list.add(1101513929);
		list.add(1315634022);
		list.add(-1369133069);
		list.add(1059961393);
		list.add(628175011);
		list.add(-1131176229);
		list.add(-859484421);
		
		List<Integer> resultList = maxset(list);
		
		resultList.forEach(System.out::println);
	}

	public static List<Integer> maxset(List<Integer> A) {

		int size = A.size();
		Map<Integer, List<Integer>> resultMap = new HashMap<>();
		int idx = 0;

		for (int i = 0; i < size; i++) {
			if (A.get(i) < 0) {
				resultMap.put(idx, A.subList(idx, i));
				idx = i;
			}
		}

		resultMap.values().forEach(list -> {
			int sum = list.stream().mapToInt(i -> i).sum();
			if (max < sum) {
				max = sum;
				result = list;
			}
		});
		
		return result;
	}
}
