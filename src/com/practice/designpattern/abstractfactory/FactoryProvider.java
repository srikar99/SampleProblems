package com.practice.designpattern.abstractfactory;

public class FactoryProvider {

	public AbstractFactory getFactory(String name) {
		if(name.equals("AbstractFactoryClass1")) {
			return new AbstractFactoryClass1();
		} else if(name.equals("AbstractFactoryClass2")) {
			return new AbstractFactoryClass2();
		}
		
		return null;
	}
}
