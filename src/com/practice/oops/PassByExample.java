package com.practice.oops;

public class PassByExample {
	static final boolean is64bit = true;

	static int b = 5;
	public static void main(String[] args) {
		Test1 t = new Test1(5);
		int a = 5;
		String s = new String("abc");
		
		System.out.println(t.x);
		s.substring(0, s.length());
		passByValue(a, b);
		passByReference(t);
		
		System.out.println(a + ", " + b);
		System.out.println(t.x);
		s = null;
	}

	private static void passByValue(int a, int b) {
		a = 10;
		b = 10;
	}

	private static void passByReference(Test1 t) {
		t = new Test1();
		t.x = 10;
	}
}	
class Test1 {
	int x = 0;
	
	public Test1(int i) {
		this.x = i;
	}
	
	public Test1() {}
}
