package com.interview.coding.desginpattern.solid.bank;

public class HDFCBank implements Bank {

	private final double amount;
	
	public HDFCBank(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return this.amount;
	}

	@Override
	public double depositCalulate() {
		return amount*6;
	}
}
