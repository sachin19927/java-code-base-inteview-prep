package com.interview.coding.colloection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.add("A");
		vector.add("F");
		vector.add("D");
		vector.add("E");
		vector.add("C");
		vector.add("B");
		
		Iterator<String> iterator = vector.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.err.println(vector.capacity());
	}
}
