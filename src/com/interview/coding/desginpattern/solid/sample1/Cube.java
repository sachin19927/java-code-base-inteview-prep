package com.interview.coding.desginpattern.solid.sample1;

public class Cube implements Shapes,ThreeDimensional {

	private final int length;
	
	public Cube(int length) {
		this.length=length;
	}
	
	public int getLength() {
		return this.length;
	}
	
	@Override
	public double area() {
		return getLength()*3;
	}

	@Override
	public double volume() {
		return 0;
	}

}
