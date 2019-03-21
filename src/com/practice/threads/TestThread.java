package com.practice.threads;

public class TestThread {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			MultithreadingExample me = new MultithreadingExample(i);
			me.start();
		}
		
	}
}
