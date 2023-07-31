package com.interview.coding.string;

public class StringSampleClass {

	
	public static void main(String[] args) {
		
		String s1="SACHIN";
		String s2="SACHIN";
		String s3="SACHIN HS";
		
		String s4= new String("SACHIN");
		String s5= new String("SACHIN");
		String s6= new String("sachin");
		
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s4==s5);
		System.out.println(s1.equals(s4));
		
		
		Integer x= 10;
		Integer y= 10;
		int a=5;
		int b=5;
		
	
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s6));
		
		
		
		
		String str1 = new String("Welcome to JavaTpoint");   
		String str2 = new String("Welcome to JavaTpoint");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Welcome to JavaTpoint").intern();   
		String str4 = new String("Welcome to JavaTpoint").intern();
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
	}
}

	