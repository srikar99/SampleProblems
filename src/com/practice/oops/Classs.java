package com.practice.oops;

public class Classs implements Interface, Interface1{

	@Override
	public void print() {
		System.out.println("Print");
	}

	public static void main(String[] args) {
		
		Classs clz = new Classs();
		clz.print();
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}
}
