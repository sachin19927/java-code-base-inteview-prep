package com.interview.coding.desginpattern.solid.bank;

import java.util.List;

public class StamentClass {

	
 private IBankService bs ;
 
 public StamentClass(IBankService bs)
 {
	 this.bs= bs;
 }
	
public void downloadStatment(List<Bank> bank) {

	System.err.println(bs.deposit(bank));
}
}
