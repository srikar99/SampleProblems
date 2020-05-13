package com.practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> map  = new LinkedHashMap<>();
		map.put("Test", "Test Value");
		map.put("test", "test Value");
		map.put("Test", "Test Value Latest");
		map.put(null, null);
		map.put(null, "Null Key");
		map.put(null, "Null Key New");
		map.put("Null Value", null);
		
		
		for(Map.Entry<String, String> entryMap : map.entrySet()) {
			System.out.println("Key: " + entryMap.getKey() + " and Value: " + entryMap.getValue());
		}
		
		System.out.println(map.get(null));
		System.out.println(1 << 30);
	}
}
