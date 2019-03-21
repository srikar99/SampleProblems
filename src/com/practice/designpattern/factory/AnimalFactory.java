package com.practice.designpattern.factory;

public class AnimalFactory {

	Mammal getMammal(String name) {
		if(name == null) {
			return null;
		}
		
		if(name.equalsIgnoreCase("cat")) {
			return new Cat();
		} else if(name.equalsIgnoreCase("dog")) {
			return new Dog();
		}
		
		return null;
	}
}
