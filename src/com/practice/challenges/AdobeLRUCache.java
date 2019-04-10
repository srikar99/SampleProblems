package com.practice.challenges;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

public class AdobeLRUCache {

	private Deque<Integer> lruQueue;
	private Map<Integer, Node> cacheMap;
	Node left = new Node();
	Node right = new Node();
	private int capacity;

	public AdobeLRUCache(int capacity) {
		lruQueue = new LinkedBlockingDeque<>();
		this.capacity = capacity;
		cacheMap = new HashMap<>();

	}

	public static void main(String[] args) {
		AdobeLRUCache cache = new AdobeLRUCache(2);
		cache.set(1, new Node(1, 1));
		cache.set(2, new Node(2, 2));
		cache.get(1);
		cache.set(3, new Node(3, 3));
		cache.set(3, new Node(4, 5));
		
		for (Map.Entry<Integer, Node> map : cache.cacheMap.entrySet()) {
			System.out.println(map.getKey());
			System.out.println(map.getValue().key);
			System.out.println(map.getValue().value);
		}
	}

	public int get(int key) {
		if (cacheMap.containsKey(key)) {
			Node node = cacheMap.get(key);
			lruQueue.remove(key);
			lruQueue.addFirst(key);
			int last = lruQueue.removeLast();
			lruQueue.addLast(last);
			return node.value;
		}
		return -1;
	}

	public void set(int key, Node value) {
		if (!cacheMap.containsKey(key)) {
			if (cacheMap.size() < capacity) {
				cacheMap.put(key, value);
				lruQueue.addFirst(key);
			} else {
				int removedKey = lruQueue.removeLast();
				cacheMap.remove(removedKey);
				cacheMap.put(key, value);
				lruQueue.addFirst(key);
			}
		} else {
			cacheMap.put(key, value);
			lruQueue.addFirst(key);
			lruQueue.removeLast();
		}
	}
}

class Node {
	Node prev;
	Node next;

	int key;
	int value;

	public Node() {
	}

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
