package com.interview.coding.colloection;

import java.util.ArrayList;
import java.util.List;

public class ListEquals {

	
	public static void main(String[] args) {
		
		
		List<String> firstList=new ArrayList<String>();  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Guava");  
		firstList.add("Mango");  
		System.out.println(firstList); 
		
		List<String> secondList=new ArrayList<String>();  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Guava");  
		secondList.add("Mango");  
		System.out.println(secondList);  
		
		//comparing both lists  
		boolean boolval = firstList.equals(secondList); //returns true because lists are equal  
		System.out.println(boolval);  
		//adding another element in the second list  
		secondList.add("Papaya");  
		//again comparing both lists  
		boolean bool = firstList.equals(secondList); //returns false because lists are not equal   
		System.out.println(bool);
		
	}
	
}
