package com.interview.coding.desginpattern.solid.sample2;

public class InterfaceSegreaterSample {

}


interface ResturantEmployee{
	void washDishes();
	void cookFood();
	void serverCustomers();
}

class WaiterA implements ResturantEmployee{

	@Override
	public void washDishes() {
	}

	@Override
	public void cookFood() {
	}

	@Override
	public void serverCustomers() {
	}
}


interface WaiterInterface{
	void serveCustomer();
	void takeOrder();
}


interface ChefInterface{
	void cookFood();
	void decideMenu();
}


class WaiterB implements WaiterInterface{
	@Override
	public void serveCustomer() {
	}
	@Override
	public void takeOrder() {
	}
}

class Chef implements ChefInterface{
	@Override
	public void cookFood() {
	}
	@Override
	public void decideMenu() {
	}
}


