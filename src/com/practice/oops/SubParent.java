package com.practice.oops;

public class SubParent extends MainParent{

	String i = "SubParent";

	static {
		System.out.println("In static block");
	}

	{
		System.out.println("SubParent");
	}

	public SubParent() {
		System.out.println("SubParent");
	}
}
