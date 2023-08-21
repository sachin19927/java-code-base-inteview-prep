package com.interview.coding.desginpattern.solid.sample2;

public class DBSaver implements InvoiceDao {

	Invoice invoice;

	public DBSaver(Invoice invoice) {
		this.invoice = invoice;
	}

	public void saveInvoice(Invoice invoice) {
		System.out.println("Save Invoice");
	}
	
}
