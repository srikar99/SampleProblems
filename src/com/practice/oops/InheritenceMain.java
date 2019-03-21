package com.practice.oops;

public class InheritenceMain {

	public static void main(String[] args) {

		ChildClass c = new ChildClass();
		
		// upcasting, child class can be directly assigned to parent class instance
		SubParent b3 = c;

		// downcasting, we need to cast to the child class because multiple classes
		// might be extending the parent class
		ChildClass c1 = (ChildClass) b3;

		SubParent b = new ChildClass();

		if (c instanceof SubParent) {
			System.out.println("true");
		}

		System.out.println(c.i + ":" + b3.i + ":" + b.i + ":" + c1.i);

	}
}
