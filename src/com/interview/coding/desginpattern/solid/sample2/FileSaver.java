package com.interview.coding.desginpattern.solid.sample2;

public class FileSaver implements InvoiceDao {

	Invoice invoice;

	public FileSaver(Invoice invoice) {
		this.invoice = invoice;
	}

	public void saveInvoice(Invoice invoice) {
		System.out.println("Save Invoice");
	}
	
}
