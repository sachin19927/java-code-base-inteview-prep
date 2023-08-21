package com.interview.coding.desginpattern.solid.sample1;

import java.util.List;

public class ShapesPrinter {

	// we are breaking the rule open closed and Dependency principle
	// If we do some change to it break open close
	//AreaCalculatorSolid areaCalculator = new AreaCalculatorSolid();
	
	private final IAreaCalculator areaCalculator;
	
	public ShapesPrinter(IAreaCalculator areaCalculator) {
		this.areaCalculator=areaCalculator;
	}
	
	public String json(int sum) {    
		return "{shapesSum: %s}".formatted(sum);
	}
	
	public String csv(int sum) {    
		return "shapes_sum, %s".formatted(sum);
	}
	
	public String json(List<Shapes> shapes) {    
		return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
	}
	
	public String csv(List<Shapes> shapes) {    
		return "shapes_sum, %s".formatted(areaCalculator.sum(shapes));
	}
	
}
