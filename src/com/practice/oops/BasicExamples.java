package com.practice.oops;

public class BasicExamples {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		String str = "Test String";

		test1(1, 1);
		test1(1);
		test1(1, 1, 2);
		test(a);
		test();

		System.out.println("value before method call: " + a + ":" + b);
		callByValue(a, b);
		System.out.println("value after method call: " + a + ":" + b);

		System.out.println("value before method call: " + str);
		callByReferece(str);
		System.out.println("value after method call: " + str);

		Test ob = new Test(15, 20);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
		
		int i = Integer.parseInt("1");
		
		System.out.println(i);
		
		System.out.println(String.valueOf(i));
	}

	private static void test() {
		System.out.println("blank method");
	}
	/*
	 * private static void test(int a) { System.out.println("In int"); }
	 */

	private static void test(int a) {
		System.out.println("In int");
	}
	
	@SuppressWarnings("unused")
	private static void test(int... a) {
		System.out.println("In varargs: " + a);
	}

	private static int test1(int a, float b) {
		System.out.println("In normal method");
		return 0;
	}

	private static int test1(int a) {
		System.out.println("In normal method");
		return 0;
	}

	private static float test1(int a, float... b) {
		System.out.println("In varargs method");
		return 0;
	}

	private static void callByValue(int a, int b) {
		a = a * 10;
		b = b / 10;
	}

	private static void callByReferece(String str) {
		str = str + " updated";
	}
	
}

class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// pass an object
	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}
}

