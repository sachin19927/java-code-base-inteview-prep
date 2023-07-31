package com.interview.coding.abstractsample;

public class BankingSolutin {

	public static void main(String[] args) {
		 Bank bank1= new Kotak();
		 Bank bank2= new Axis();
	}
}


abstract class Bank{
	
	int x;
	static int y;
	private static int z;
	private  int m;
	abstract double deposit();
	abstract double lending();
	abstract double carLoan();
	abstract double personalLoan();
	
	public Bank() {
	}
	public static void main(String[] args) {
		
	}
	
	
}

class Kotak extends Bank{

	@Override
	double deposit() {
		return 100;
	}

	@Override
	double lending() {
		return 1000;
	}

	@Override
	double carLoan() {
		return 9.5;
	}

	@Override
	double personalLoan() {
		return 11.10;
	}
	
}

class Axis extends Bank{

	@Override
	double deposit() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	double lending() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	double carLoan() {
		return 0;
	}

	@Override
	double personalLoan() {
		return 9.5;
	}
	
}