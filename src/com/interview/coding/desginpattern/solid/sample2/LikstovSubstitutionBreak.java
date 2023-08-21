package com.interview.coding.desginpattern.solid.sample2;

public class LikstovSubstitutionBreak {

}


interface Bike{
	void startEngine();
	void accelerate();
}

class MotorCycle implements Bike{
	
	boolean isEngineOn;
	int speed;

	@Override
	public void startEngine() {
		isEngineOn=true;
		
	}

	@Override
	public void accelerate() {
		int speed=this.speed*10;
		
	}
	
}

class BiCycle implements Bike{

	@Override
	public void startEngine() {
		throw new RuntimeException("Engine won't start");
		
	}

	@Override
	public void accelerate() {
		
	}
	
}