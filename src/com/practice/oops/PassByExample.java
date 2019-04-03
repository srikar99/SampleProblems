package com.practice.oops;

public class PassByExample {

	public static void main(String[] args) {
		Test1 t = new Test1(5);
		int a = 5;
		String s = new String("abc");
		
		s.substring(0, s.length());
		passByValue(a);
		passByReference(t);
		
		System.out.println(a);
		System.out.println(t.x);
	}

	private static void passByValue(int a) {
		a = 10;
	}

	private static void passByReference(Test1 t) {
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
