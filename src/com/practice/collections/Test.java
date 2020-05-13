package com.practice.collections;

public interface Test {
	
	public String FIELD = "Test";

	public void printMessage(String message);
	
	default void printAnotherMessage() {
		System.out.println("Printing from interface");
	}
	
	default void print() {
		System.out.println("Second message from interface");
	}
	
	default String getSomething(String str) {
		StringBuilder builder = new StringBuilder(str);
		builder.append("Appended string");
		
		return builder.toString();
	}
}
