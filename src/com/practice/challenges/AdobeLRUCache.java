package com.practice.challenges;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AdobeLRUCache {

	private Deque<Integer> lruQueue;
	private Map<Integer, Node> cacheMap;
	Node left = new Node();
	Node right = new Node();
	private int capacity;
	
	public AdobeLRUCache(int capacity) {
		this.capacity = capacity;
		cacheMap = new HashMap<>();
		
	}
	public static void main(String[] args) {
		
	}
	
	public int get(int key) {
		if(cacheMap.containsKey(key)) {
			Node node = cacheMap.get(key);
			return node.value;
		}
		return -1;
	}
	
	public void set(int key, Node value) {
		if(!cacheMap.containsKey(key)) {
			cacheMap.put(key, value);
		}
	}
	public void removeNode(Node node) {
		
	}
	
	public void addNode(Node node) {
		
	}
	
	class Node {
		Node prev;
		Node next;
		
		int key;
		int value;
		
		public Node() {}
		
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
}
