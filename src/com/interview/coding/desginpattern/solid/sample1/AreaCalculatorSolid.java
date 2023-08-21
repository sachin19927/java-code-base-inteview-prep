package com.interview.coding.desginpattern.solid.sample1;

import java.util.List;

public class AreaCalculatorSolid implements IAreaCalculator {

	public int sum(List<Shapes> shapes) {
	
		int sum = 0;
		
		for(Shapes shape : shapes)
		{
			sum+=shape.area();
		}
		return sum;
	}
	
}
