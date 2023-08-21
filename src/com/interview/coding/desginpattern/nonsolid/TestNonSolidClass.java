package com.interview.coding.desginpattern.nonsolid;

import java.util.List;

public class TestNonSolidClass {

	public static void main(String[] args) {
		
		AreaCalulatorNonSolid nonSolid = new AreaCalulatorNonSolid();
		Circle circle = new Circle(10);
		Square square = new Square(10);
		
		List<Object> shapes = List.of(circle,square);
		int sum = nonSolid.sum(shapes);
		System.out.println("Sum = "+sum);
		System.out.println(nonSolid.json(shapes));
		System.out.println(nonSolid.csv(shapes));
	}
}
