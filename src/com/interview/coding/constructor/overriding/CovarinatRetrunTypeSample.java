package com.interview.coding.constructor.overriding;

public class CovarinatRetrunTypeSample {

}


class Parents{
	
	public Object getHeight()
	{
		return new Object();
	}
	
	public Object getSkinColour()
	{
		return new Object();
	}
	
	public Parents getInstance() {
		
		return new Parents();
	}
}


class child1 extends Parents{
	
	@Override
	public Double getHeight() {
		return new Double(5.2);
	}
	
	@Override
	public Object getSkinColour() {
		return super.getSkinColour();
	}
	
	@Override
	public child1 getInstance() {
		// TODO Auto-generated method stub
		return new child1();
	}
}

class child2 extends Parents{
	
	@Override
	public child1 getInstance() {
		// TODO Auto-generated method stub
		return new child1();
	}
}


