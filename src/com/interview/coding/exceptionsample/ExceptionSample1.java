package com.interview.coding.exceptionsample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionSample1 {

	
	public static void main(String[] args) throws FileNotFoundException {
		// FileReader fileReader = new FileReader("TEST");
		 
		 
		  System.out.println("Flow Start");

		  try {
		  System.out.println("Flow logic");
		  //System.exit(0);
		  int a[]=new int[5];   
		  a[5]=30/5;
		  
		  }
		
		 catch (ArithmeticException e) {
			 System.out.println("Flow Infinite");
		}
		  catch (ArrayIndexOutOfBoundsException e) {
				 System.out.println("Flow Array");
		}
		  catch (Exception e) {
				 System.out.println("Flow General");
			}
		  
		  finally {
			  System.out.println("Flow Exits");
		}
		  
		 
	}
}
