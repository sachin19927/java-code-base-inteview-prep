package com.interview.coding.desginpattern.singleton;

public class CustomSingleton {

	private static CustomSingleton customSingleton;  //Step 1: Declare private static data member which will be class itself
	
	private CustomSingleton() {  // Step 2 : Create private constructor so it can't be accessed from any where apart this class
		
	}
	
	// Step 5: use synchronized in method to make it thread safe
	 public static synchronized CustomSingleton getInstance()  // Step3 : create public static getInstance method which returns object itself
	    {
	        if (customSingleton == null)   // Step 4: check if object is null then create object if not it will avoid duplicate
	        	customSingleton = new CustomSingleton();
	  
	        return customSingleton;
	    }
}
