package com.practice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		subtype();
	}
	
	//subtyping in generics
	private static void subtype() {
		List<String> ls = new ArrayList<String>();
		// the below line throws error because in generics
		// if Foo(String) is subtype of Bar(Object), and G(List) is a generic
		// type definition, then G<Foo> is not subtype of G<Bar>
		
		// List<Object> lo = ls;
		
	}
	
	private static void wildcards() {
		// collection of unknown
		Collection<?> col = new ArrayList<String>();
		// in collection object is not the supertype, if we want to
		// use any collection, "?" is used.
	}

}
