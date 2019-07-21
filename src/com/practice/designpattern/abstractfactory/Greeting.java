package com.practice.designpattern.abstractfactory;

public class Greeting implements AbstractFactoryInterface{

	@Override
	public void print(String name) {
		System.out.println("Printing Greeting: " + name);
	}

}
