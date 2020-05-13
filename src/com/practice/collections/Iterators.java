package com.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Iterators {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Spliterator<Integer> itr = list.parallelStream().spliterator();
		
		itr.forEachRemaining(System.out::println);
		
	}
}
