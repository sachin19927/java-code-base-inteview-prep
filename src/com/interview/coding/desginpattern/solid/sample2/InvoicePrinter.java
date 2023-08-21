package com.interview.coding.desginpattern.solid.sample2;

public class InvoicePrinter {

	Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printInvoice() {
		System.out.println("Print Invoice");
	}
	
}
