package com.interview.coding.desginpattern;

public class SingletonTestingClass {

	public static void main(String[] args) {
		CustomSingleton cs1= CustomSingleton.getInstance();
		CustomSingleton cs2= CustomSingleton.getInstance();
		System.err.println(cs1.hashCode());
		System.err.println(cs2.hashCode());
		
	}
}
