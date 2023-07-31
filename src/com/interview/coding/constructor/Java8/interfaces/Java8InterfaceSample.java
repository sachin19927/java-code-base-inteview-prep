package com.interview.coding.constructor.Java8.interfaces;

public class Java8InterfaceSample {

}


interface Bank{
	
	void draw();
	
	default void deposit() {
		System.err.println("depost money");
	}
	
	static void money() {
	System.err.println("Moeny machine");	
	}
}


class Axis implements Bank{

	@Override
	public void draw() {
		System.err.println("Axis draw money");
	}
	
}