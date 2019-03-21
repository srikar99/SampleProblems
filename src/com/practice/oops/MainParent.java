package com.practice.oops;

public class MainParent {

	int i = 100;

	static {
		System.out.println("In static block");
	}

	{
		System.out.println("A");
	}

	public MainParent() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		System.out.println("A main");
	}

}
