package com.interview.coding.exceptionsample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionSample2 {

	
	public static void main(String[] args) {
		
		 
		try {
		
			int x=10;
			
			try {
				FileReader fr= new FileReader("resr");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				
			}
		}
		catch (Exception e) {
			
		}
		finally {
			
		}
	}
}
