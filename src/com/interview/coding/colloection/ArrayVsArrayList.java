package com.interview.coding.colloection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsArrayList {

	
	public static void main(String[] args) {
		
		int[] integer= new int[5];
		int[][] integerMulti= new int[5][2];
		
		integer[2]=50;
		
		for (int i = 0; i < integer.length; i++) {
			
		}
		//System.err.println(integer[6]);
		
		List<Integer> integer1 = new ArrayList<>();
		integer1.add(1);
		//System.err.println(integer1.get(6));
		
		for (Integer integer2 : integer1) {
			
		}
	
	}
}
