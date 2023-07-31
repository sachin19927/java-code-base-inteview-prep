package com.interview.coding.exceptionsample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionSample3 {

	
	public  void voter(int x) {
		
		if(x<18)
		{
			throw new ArithmeticException("Age Limit is not matching");
		}
		
		else
		{
			System.out.println("Voted");
		}
		System.err.println("AFTER FAIL case");
	}
	
	public static void main(String[] args) {

		ExceptionSample3 sample3 = new ExceptionSample3();
		
		System.out.println("Start");
		try {
		sample3.voter(17);}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("End");
		
		 
	}
}
