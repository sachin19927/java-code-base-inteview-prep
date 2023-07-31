package com.interview.coding.exceptionsample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLInput;

public class ExceptionSample6 {

	int divisionMethos(int x, int y) throws ArithmeticException {
		int z= x/y;
		return z;
	}
	
	public static void main(String[] args) {
		
		ExceptionSample6 sample6= new ExceptionSample6();
		
		
		try
		{
			
			sample6.divisionMethos(10, 0);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}


