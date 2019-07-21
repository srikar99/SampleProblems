package com.practice.designpattern.abstractfactory;

public class AbstractFactoryClass1 extends AbstractFactory{

	@Override
	public AbstractFactoryInterface printMessage(String name) {
		if(name.equals("greeting")) {
			return new Hello();
		} else if(name.equals("hello")) {
			return new Greeting();
		}
		return null;
	}

}
