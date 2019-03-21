package com.practice.threads;

public class MultithreadingExample extends Thread {
	int i = 0;

	public MultithreadingExample(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		Thread t = new Thread("thread-" + i);
		System.err.println(t.getName());
	}

	public void one() {
		System.out.println("One");
	}

	public void two() {
		System.out.println("two");
	}

	public void three() {
		System.out.println("three");
	}

	public void four() {
		System.out.println("four");
	}

	public void five() {
		System.out.println("five");
	}
}
