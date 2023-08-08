package com.interview.coding.colloection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("B");
		set.add("A");

		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		Set<String> linkSet= new LinkedHashSet<>();
		linkSet.addAll(set);
		System.out.println(linkSet);
		
		
		List<String> list = Arrays.asList("A","A","Z","C","D","D");
		System.err.println(list);
		Set<String> linkSetNew= new LinkedHashSet<>();
		linkSetNew.addAll(list);
		System.out.println(linkSetNew);
		
		
		
		
	}
	
}
