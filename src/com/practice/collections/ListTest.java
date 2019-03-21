package com.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

	private static List<Object> list = new ArrayList<>();
	
	public static void main(String[] args) {
		sampleExample();
		mappingExample();
	}

	private static void sampleExample() {
		Object i = 1;

		list.add(1);
		list.add("One");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("One");
		
		list.stream().filter(a -> a == i).forEach(System.out::println);
		List<?> list1 = list.stream().filter(obj -> obj.equals("One")).map(o -> o).collect(Collectors.toList());
		System.out.println(list1.size());
	}
	
	private static void mappingExample() {
		List<String> stringList = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		stringList.add("4");
		
		List<Integer> intList = new ArrayList<>();
		
		stringList.stream().filter(s -> (Integer) Integer.parseInt(s) instanceof Integer).map(s -> s).collect(Collectors.toList());
		intList.forEach(System.out::println);
	}
	
}
