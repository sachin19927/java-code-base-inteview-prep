package com.interview.coding.colloection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("E");
		list.add("F");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.err.println("*******************************");
		list.forEach(x->System.out.println(x));
		
		
		List<String> linkList = new LinkedList<>();
		linkList.addAll(list);
		System.err.println("*******************************");
		linkList.forEach(x->System.out.println(x));
		
		linkList.remove(2);
		linkList.remove(3);
		System.err.println("*******************************");
		//linkList.forEach(x->System.out.println(x));
		
		
		List<String> dummy = new LinkedList<>();
		String s1 =null;
		System.out.println(dummy.isEmpty());
		System.out.println(s1);
		
		
		
		
		
	}
}
