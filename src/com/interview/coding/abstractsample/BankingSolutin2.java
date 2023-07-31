package com.interview.coding.abstractsample;

public class BankingSolutin2 {

	public static void main(String[] args) {
		 Bank bank1= new Kotak();
		 Bank bank2= new Axis();
	}
}


 interface Bank2{
	
	int x=10;
     int y=20;

	 double deposit();
	 double lending();
	 double carLoan();
	 double personalLoan();
	

	
	
}

class Kotak2 implements Bank2{

	@Override
	public double deposit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double lending() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double carLoan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double personalLoan() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

class Axis2 implements Bank2{

	@Override
	public double deposit() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public double lending() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public double carLoan() {
		return 0;
	}

	@Override
	public double personalLoan() {
		return 9.5;
	}
	
}