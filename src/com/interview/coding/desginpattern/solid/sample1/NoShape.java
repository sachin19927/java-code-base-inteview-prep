package com.interview.coding.desginpattern.solid.sample1;

public class NoShape implements Shapes {

	
	// Breaks the 3 rd principle 
	@Override
	public double area() {
		throw new IllegalStateException("Cannot calulate and area");
	}
}
