package com.interview.coding.abstractsample;

public class SampleAbstractClass {

	public static void main(String[] args) {
		Bike bike = new Bike() {

			@Override
			void engine() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Bike bike1 = new Pulsar();
		bike.run();
		bike.engine();
		
		Pulsar pulse= new Pulsar();
		pulse.run();
		pulse.engine();
		
		//Honda honda = new Honda();
		
		
	}
}


abstract class Bike{
	
	static void getData() {
		
	}
	
	//abstract static void loadData();
	
	final void wheel() {
		System.err.println("2 wheels");
	}
	
	
	void run() {
		System.err.println("RUN BIKE");
	}
	
	abstract void engine();
	
	
	public Bike() {
	}
}

class Pulsar extends Bike{

	@Override
	void engine() {
		System.err.println("V4 Engine");
		
	}
	
}

abstract class Honda extends Bike{
	
}