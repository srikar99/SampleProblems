package com.practice.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample implements Comparable<ComparableExample>{

	int id;
	
	public ComparableExample(int id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(ComparableExample o) {
		return this.id - o.id;
	}
	
	public static void main(String[] args) {
		List<ComparableExample> list = new ArrayList<>();
		list.add(new ComparableExample(10));
		list.add(new ComparableExample(88));
		list.add(new ComparableExample(23));
		list.add(new ComparableExample(45));
		list.add(new ComparableExample(67));
		
		Collections.sort(list);
		
		for(ComparableExample c : list) {
			System.out.println(c.id);
		}
	}

}
