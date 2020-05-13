package com.practice.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCopyInformatica {

	public static void main(String[] args) {
		List<Integer> intList1 = new ArrayList<>();
		List<Integer> intList2 = new ArrayList<>();
		
		intList1.add(1);
		intList1.add(5);
		intList1.add(3);
		intList1.add(8);
		intList1.add(7);
		intList1.add(4);
		
		intList2.add(2);
		intList2.add(6);
		intList2.add(9);
		intList2.add(23);
		intList2.add(11);
		intList2.add(19);
		
		combineList(intList1, intList2);
	}
	
	private static void combineList(List<Integer> intList1, List<Integer> intList2) {
		
		intList1.stream().forEach(item -> {
			intList2.add(item);
		});
		
		Collections.sort(intList2);
		System.out.println(intList2);
	}
}
