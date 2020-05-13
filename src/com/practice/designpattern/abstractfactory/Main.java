package com.practice.designpattern.abstractfactory;

public class Main {

	public static void main(String[] args) {
		FactoryProvider provider = new FactoryProvider();
		
		AbstractFactory factory = provider.getFactory("AbstractFactoryClass1");
		AbstractFactoryInterface afi = factory.printMessage("greeting");
		afi.print("AbstractFactoryClass1");
		AbstractFactory factory1 = provider.getFactory("AbstractFactoryClass2");
		AbstractFactoryInterface afi2 = factory1.printMessage("greeting");
		afi2.print("AbstractFactoryClass2");
	}
}
