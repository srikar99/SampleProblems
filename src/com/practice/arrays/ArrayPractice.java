package com.practice.arrays;

public class ArrayPractice {

	int[] stack;
	int tos = -1;
	
	public ArrayPractice(int size) {
		stack = new int[size];
	}
	
	public static void main(String[] args) {
		ArrayPractice stack = new ArrayPractice(10);
		stack.push(10);
		stack.push(20);
		stack.push(40);
		stack.push(30);
		stack.push(240);
		stack.pop();
		stack.push(90);
		stack.printArray(stack.stack.length);
	}
	
	private void push(int item) {
		if(tos == stack.length - 1) {
			System.err.println("Stack is full");
		}
		stack[++tos] = item;
	}
	
	private int pop() {
		if(tos < 0) {
			System.err.println("Stack is empty");
			return 0;
		}
		return stack[tos--];
	}
	
	private void printArray(int n) {
		if(n == 0) {
			return;
		} else {
			printArray(n - 1);
			System.out.println(stack[n - 1]);
		}
	}
}
