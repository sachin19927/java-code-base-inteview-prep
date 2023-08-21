package com.interview.coding.desginpattern.solid.sample1;

public class Square implements Shapes {

private final int length;
	
	public Square(int length) {
		this.length=length;
	}
	
	public int getLength() {
		return length;
	}
	
	@Override
	public double area() {
		return  Math.pow(getLength(), 2);
	}
}
