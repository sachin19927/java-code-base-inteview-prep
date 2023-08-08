package com.interview.coding.colloection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetSortReverse {

	
	
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet();   
		set.add("Computer");  
		set.add("Hard Disk");  
		set.add("DRAM"); 
		
		Set<Integer>  numbers = new HashSet<>();   
		numbers.add(456);  
		numbers.add(123);   
		numbers.add(789);  
		
		System.out.println(set);
		System.out.println(numbers);
		
		
		Set<String> data= set.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toSet());
		
		System.out.println(data);
		System.out.println(numbers);
		

	}
}


