package com.interview.coding.desginpattern.solid.bank;

public class SBIBank implements Bank {

	private final double amount;
	
	public SBIBank(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return this.amount;
	}

	@Override
	public double depositCalulate() {
		return amount*4;
	}
}
