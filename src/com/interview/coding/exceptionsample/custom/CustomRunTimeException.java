package com.interview.coding.exceptionsample.custom;

public class CustomRunTimeException {

	
	public static void main(String[] args) {
		
		throw new UserDefinedRunTimeException("Throw run time user defined expection");
	}
	
	public void throwAndHandle()
	{
		try {
			throw new UserDefinedRunTimeException("Throw and Handle run time user defined expection ")	;
		}
		catch (UserDefinedRunTimeException e) {
		System.err.println(e.getMessage());	
		}
	}
}



class UserDefinedRunTimeException extends RuntimeException{
	
	public UserDefinedRunTimeException(String str) {
		super(str);
	}
}
