package com.interview.coding.desginpattern.solid.sample2;

public class Invoice {

	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotal() {
		int price = marker.price*quantity;
		return price;
	}
	
	public void printInvoice() {
		System.out.println("Print Invoice");
	}
	
	public void saveInvoiceToDB() {
		System.out.println("Save Invoice to DB");
	}
	
}
