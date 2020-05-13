package com.practice.objects;

public class Clone implements Cloneable{

	public static void main(String[] args) {
		Clone clone = new Clone();
		clone.printMessage();
		try {
			Clone clone1 = (Clone) clone.clone();
			System.out.println(clone1 == clone);
			clone1.printMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printMessage() {
		System.out.println("Clone");
	}
}
