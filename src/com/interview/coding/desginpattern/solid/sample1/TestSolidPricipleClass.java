package com.interview.coding.desginpattern.solid.sample1;

import java.util.List;

public class TestSolidPricipleClass {

	public static void main(String[] args) {
		
		//AreaCalculatorSolid solid = new AreaCalculatorSolid();
		IAreaCalculator solid = new AreaCalculatorSolid();
		Circle circle = new Circle(10);
		Square square = new Square(10);
		Cube cube = new Cube(5);
		Rectangle rectangle = new Rectangle(5,10);
		NoShape noShape = new NoShape();
		
		List<Shapes> shapes = List.of(circle,square,cube,rectangle);
		
		// below one gives error since No shape is not implement with proper Parent class kept in mind
		//List<Shapes> shapes = List.of(circle,square,cube,rectangle,noShape);
		
		int sum = solid.sum(shapes);
		
		ShapesPrinter  printer = new ShapesPrinter(solid);
		
		System.out.println(printer.json(sum));
		System.out.println(printer.csv(sum));
		
		System.out.println(printer.json(shapes));
		System.out.println(printer.csv(shapes));
	}
}
