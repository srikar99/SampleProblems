package com.practice.oops;

public class ChildClass extends SubParent{
	
	String i = "ChildClass";

	static {
		System.out.println("In static block");
	}

	{
		System.out.println("ChildClass");
	}

	public ChildClass() {
		System.out.println("ChildClass");
	}
}
