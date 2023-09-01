package com.interview.coding.desginpattern.solid.bank;

public class AxisBank implements Bank,StockExchange {

private final double amount;
	
	public AxisBank(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return this.amount;
	}

	@Override
	public double depositCalulate() {
		
		return amount*2;
	}

	@Override
	public boolean stockAllowed() {
		return false;
	}
}
