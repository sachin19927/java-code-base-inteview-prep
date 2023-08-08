package com.interview.coding.colloection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListEquals {

//	Compare Array List
	
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
		boolean equalsMethod = firstList.equals(secondList); //returns true because lists are equal  
		System.out.println(equalsMethod);  
		//adding another element in the second list  
		secondList.add("Papaya");  
		//again comparing both lists  
		boolean equalsMethod1 = firstList.equals(secondList); //returns false because lists are not equal   
		System.out.println(equalsMethod1);
		
		
		//removes all elements from the first list  
		//returns empty list if all the elements of first list match with elements of second list  
		 secondList.removeAll(firstList);
		 System.out.println(firstList);
		 System.out.println(secondList);
		
		 
		 
		//first arraylist  
		 ArrayList<String> firstArrayList=new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T")); 
		
		 System.out.println(firstArrayList);
		 //second arraylist      
		 List<String> secondArrayList=new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));
		 System.out.println(secondArrayList);
		 
		 
		 secondArrayList.retainAll(firstArrayList);
		 
		System.out.println(secondArrayList);  
		
		
		
		//first arraylist  
		ArrayList<String> firstContainsList= new ArrayList<String>(Arrays.asList("Good", "Morning", "Students"));  
		
		//second arraylist  
		ArrayList<String> secondContainsList= new ArrayList<String>(Arrays.asList("Good", "Night", "frineds"));
		 
		
		ArrayList<String> thirdList= new ArrayList<String>();  
		//iterator using for-each loop  
		
		for (String first : firstContainsList) {
			thirdList.add(secondContainsList.contains(first)?"Yes":"No");
		}
		
		System.out.println(thirdList);
		
		
		
		
		ArrayList<String> firstContenteEqList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
		ArrayList<String> secondContenteEqList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go")); 
		
		System.out.println(firstContenteEqList.toString());
		System.out.println(secondContenteEqList.toString());
		System.out.println(firstContenteEqList.toString().contentEquals(secondContenteEqList.toString()));
		 
		
		ArrayList<String> firstStreamsList  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
		
		ArrayList<String> secondStreamsList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));  
		
		System.out.println(firstStreamsList);
		System.out.println(secondStreamsList);
		
		List<String> filteredList = firstStreamsList.stream().filter(secondStreamsList::contains).collect(Collectors.toList());
		
		
		List<String> filteredListNew = firstStreamsList.stream().filter((x)-> secondStreamsList.contains(x)).collect(Collectors.toList());
		
		System.out.println(filteredList);
		System.out.println(filteredListNew);
	}
	
}
