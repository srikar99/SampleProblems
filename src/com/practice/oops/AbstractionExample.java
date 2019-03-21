package com.practice.oops;

public abstract class AbstractionExample {

	public abstract void abstractionExample();
	
	public static void concreteMethodInAbstractClass() {
		System.out.println("Concrete method");
	}
	
	public static void main(String[] args) {
		AbstractionMainClass abm = new AbstractionMainClass();
		concreteMethodInAbstractClass();
		abm.abstractionExample();
	}
}
