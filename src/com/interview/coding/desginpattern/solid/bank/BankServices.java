package com.interview.coding.desginpattern.solid.bank;

import java.util.List;

public class BankServices implements IBankService {

	public double deposit( List<Bank> banks) {
		
		double sum = 0;
		
		for(Bank bank: banks) {
			sum+= bank.depositCalulate();
		}
		
		return sum;
	}
	
}
