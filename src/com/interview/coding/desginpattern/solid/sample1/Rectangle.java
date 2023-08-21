package com.interview.coding.desginpattern.solid.sample1;

public class Rectangle implements Shapes {

	private final int height;
	private final int width;
	
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public double area() {
		return getHeight()*getWidth();
	}

}
