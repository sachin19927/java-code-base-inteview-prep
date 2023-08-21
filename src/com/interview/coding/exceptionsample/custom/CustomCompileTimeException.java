package com.interview.coding.exceptionsample.custom;

public class CustomCompileTimeException {

	public static void main(String[] args) throws UserDefinedCompileTimeException {
		CustomCompileTimeException ct= new CustomCompileTimeException();
		
		ct.throwAndHandle();
		
		throw new UserDefinedCompileTimeException("Complie time Exception")	;
	}
	
	public void throwAndHandle()
	{
		try {
			throw new UserDefinedCompileTimeException("Complie time Exception throw and handle")	;
		}
		catch (UserDefinedCompileTimeException e) {
		System.err.println(e.getMessage());	
		}
	}
	
}


class UserDefinedCompileTimeException extends Exception{
	
	public UserDefinedCompileTimeException(String str) {
		super(str);
	}
}