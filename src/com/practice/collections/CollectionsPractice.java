package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Common methods for all collections
 * @author shreekar.pujari
 *
 */
public class CollectionsPractice {
	
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		// this is providing type safety, collection is of type string
		// and we are adding integer, so compile time error is throw
		
		// list.add(1);
		
		// prior to generics, all collections were of type object, which might 
		// accidently result in runtime error.

		// adding element of type E
		list.add("String");
		list.add("String");
		
		// removing element at an index
		//list.remove(1);
		
		// removeAll() is used to remove all the elements, except the ones which are retained by retainAll()
		// retainAll(Collection<E> collection) retains all the elements of a collection
		//removeAllTest();
		
		//clear() to clear the collection
		
		// list.clear();
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
			System.out.println(itr.next());
		}
	}

	@SuppressWarnings("unused")
	private static void removeAllTest() {
		List<String> list1 = new ArrayList<>();
		list1.add("List 2");
		list1.add("List 2");
		list1.add("List 2");
		list1.add("List 2");
		
		list.addAll(list1);
		
		list.add("First Element");
		list.add("First Element");
		list.add("First Element");
		list.add("First Element");
		
		list.retainAll(list);
		list.removeAll(list1);
		
		for(String s : list) {
			 System.out.println(s);
		}
	}

}
