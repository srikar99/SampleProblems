package com.practice.designpattern.abstractfactory;

public class Hello implements AbstractFactoryInterface{

	@Override
	public void print(String name) {
		System.out.println("Printing hello: " + name);
	}

}
