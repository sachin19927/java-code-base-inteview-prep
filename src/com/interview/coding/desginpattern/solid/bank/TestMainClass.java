package com.interview.coding.desginpattern.solid.bank;

import java.util.List;

public class TestMainClass {

	public static void main(String[] args) {
		
		BankServices bs = new BankServices();
		
		AxisBank ab= new AxisBank(600);
		SBIBank sb= new SBIBank(600);
		SBIBank hb= new SBIBank(800);
	//	NoBank nb= new NoBank();
		
		List<Bank> listOfBanks = List.of(ab,sb,hb);
		
		double total = bs.deposit(listOfBanks);
		
		System.err.println("Sum ="+total);
		
		StamentClass sc = new StamentClass(bs);
		
		sc.downloadStatment(listOfBanks);
		
		
	}
}
