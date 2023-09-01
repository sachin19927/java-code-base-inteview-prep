package com.interview.coding.desginpattern.solid.bank;

public class NoBank implements Bank {

	@Override
	public double depositCalulate() {
		throw new IllegalStateException("No Bank Implementation");
	}
}
