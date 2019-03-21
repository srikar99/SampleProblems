package com.practice.designpattern.factory;

public class Main {

	public static void main(String[] args) {
		AnimalFactory af = new AnimalFactory();
		Mammal mammal = af.getMammal("dog");
		
		mammal.makeSound();
	}
}
