package com.interview.coding.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestImmutableClass {

	public static void main(String[] args) throws CloneNotSupportedException, ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String name="SACHIN HS";
		int age=30;
		Date dob= formatter.parse("07-09-1992");
		List<String> lang = Arrays.asList("KAN","ENG","HIN");
		LocalDate onboardDate = LocalDate.now();
		
		Employee employee = new Employee(name, age, dob, onboardDate, lang, new Address("Home", "Jayanti", "Bengaluru"));
		 
		 
	      System.err.println("**********Before***********");
		  System.out.println(employee);
		  
		  Address address = employee.getAddress();
		  address.setAddress("Hi-tech City");
	      address.setAddressType("Office");
	      address.setCity("Hyderabad");
	      employee.getDateOfBirth().setDate(30);
	      employee.getOnboardingDate().lengthOfYear();
	      //employee.getLang().add("GER");
	      
	      System.err.println("**********After***********");
	      System.out.println(employee);
	}
}
