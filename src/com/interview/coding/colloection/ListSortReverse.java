package com.interview.coding.colloection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortReverse {

	
	
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();   
		list.add("Computer");  
		list.add("Hard Disk");  
		list.add("DRAM"); 
		
		List<Integer>  numbers = new ArrayList<>();   
		numbers.add(456);  
		numbers.add(123);   
		numbers.add(789);  
		
		System.out.println(list);
		System.out.println(numbers);
		Collections.sort(list);
		Collections.sort(numbers);
		
		System.out.println(list);
		System.out.println(numbers);
		
		Collections.sort(list,Collections.reverseOrder());
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(numbers);
	}
}


