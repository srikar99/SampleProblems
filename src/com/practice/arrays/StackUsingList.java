package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class StackUsingList {

	List<Integer> stack;
	int top = -1;
	int size;
	
	public StackUsingList(int size) {
		stack = new ArrayList<>(size);
		this.size = size;
	}
	
	public static void main(String[] args) {
		StackUsingList so = new StackUsingList(5);
		so.push(10);
		so.push(23);
		so.push(16);
		so.push(17);
		so.push(18);
		so.pop();
		so.printList();
	}
	
	private void push(int item) {
		if(top == size-1) {
			throw new StackOverflowError();
		}
		
		stack.add(top + 1, item);
		top++;
	}
	
	private void pop() {
		if(top == -1) {
			throw new IllegalAccessError();
		}
		
		stack.remove(top);
		top--;
	}
	
	private void printList() {
		for(int i : stack) {
			System.out.println(i);
		}
	}
}
