package com.practice.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Common methods for all collections
 * @author shreekar.pujari
 *
 */
public class CollectionsPractice {
	
	static List<String> list = new ArrayList<>();
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		// this is providing type safety, collection is of type string
		// and we are adding integer, so compile time error is throw
		
		// list.add(1);
		
		// prior to generics, all collections were of type object, which might 
		// accidently result in runtime error.

		// adding element of type E
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("Start time: " + System.nanoTime());
		String[] strArr = list.toArray(new String[list.size()]);
		System.out.println("Start time: " + System.nanoTime());
		
		// removing element at an index
		//list.remove(1);
		
		// removeAll() is used to remove all the elements, except the ones which are retained by retainAll()
		// retainAll(Collection<E> collection) retains all the elements of a collection
		//removeAllTest();
		
		//clear() to clear the collection
		
		// list.clear();
		
		//Iterator<String> itr = list.iterator();
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
			System.out.println(itr.next());
		}*/
		
		iterateOverList();
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
	
	private static void iterateOverList() {
		List<Integer> numList = new ArrayList<>();
		
		numList.add(5);
		numList.add(3);
		numList.add(1);
		numList.add(6);
		numList.add(2);
		numList.add(9);
		
		ListIterator<Integer> itr = numList.listIterator();
		
		while(itr.hasNext()) {
			if(itr.next() > 5) {
				numList.add(itr.nextIndex(), itr.next() + 1);
			}
		}
		System.out.println(numList);
	}
}
