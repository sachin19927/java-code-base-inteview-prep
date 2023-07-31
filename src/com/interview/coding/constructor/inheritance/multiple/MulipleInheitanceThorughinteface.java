package com.interview.coding.constructor.inheritance.multiple;

public class MulipleInheitanceThorughinteface {

}



interface Printable{
	void print();
}

interface showable{
	void show();
}

class Common implements Printable, showable{

	@Override
	public void show() {
		System.out.println("Show Method");
	}

	@Override
	public void print() {
		System.out.println("Print Method");
	}
	
}

interface CommonUpgrade extends Printable, showable{
	
}


class NewUpgarde implements CommonUpgrade{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}