package com.practice.collections;

public class TestImpl implements Test{

	@Override
	public void printMessage(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Test t = new TestImpl();
		TestImpl t1 = new TestImpl();
		t.print();
		t.printMessage("Hello world");
		t.printAnotherMessage();
		System.out.println(t.getSomething("Plain string"));
		
		System.out.println(t1.FIELD);
	}
}
