package com.interview.coding.desginpattern.nonsolid;

import java.util.List;

public class AreaCalulatorNonSolid {

	public int sum(List<Object> shapes) {
		int sum = 0;
		
		for (int i = 0; i < shapes.size(); i++) {
			Object shape = shapes.get(i);
			if(shape instanceof Square) {
				sum+=Math.pow(((Square)shape).getLength(), 2);
			}
			
			if(shape instanceof Circle) {
				sum+=Math.PI * Math.pow(((Circle)shape).getRadius(), 2);
			}
			
			// this breaks the rule of OC principle 
			// Class should be open extension but should closed for modification
			// like this cube class if we get 10 more shapes every time we can't add this if case 
			if(shape instanceof Cube) {
				
			}
			
		}
		return sum;
	}
	
	
	
	
	/*
	 * Break Single Responsbility since Area calulator is diff printing is diff functionality
	 * below methods should be on his own class
	 */
	public String json(List<Object> shapes) {    
		return "{sum: %s}".formatted(sum(shapes));
	}
	
	public String csv(List<Object> shapes) {    
		return "sum, %s".formatted(sum(shapes));
	}
	
}
