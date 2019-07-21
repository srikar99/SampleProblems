package com.practice.designpattern.abstractfactory;

public class AbstractFactoryClass2 extends AbstractFactory{

	@Override
	public AbstractFactoryInterface printMessage(String name) {
		if(name.equals("hello")) {
			return new Hello();
		} else if(name.equals("greeting")) {
			return new Greeting();
		}
		return null;
	}

}
