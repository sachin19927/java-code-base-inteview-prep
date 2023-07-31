package com.interview.coding.exceptionsample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLInput;

public class ExceptionSample5 {

	
}


class A {
	
	
	void getResults()  {
		System.err.println("Rule 1 SuperClass No excpetion but child calls unchecked only");
	}
	
	void getData() throws IOException {
		System.err.println("Rule 2 SuperClass throws excpetion but child calls can thorugh only that its child class");
	}
	
	void readData() throws IOException {
		System.err.println("Rule 3 SuperClass throws excpetion but child calls don't thorws anything ");
	}
	
}
class B extends A{
	@Override
	void getResults()throws ArithmeticException {
	}
	
	@Override
	void getData() throws FileNotFoundException {
	}
	
	@Override
	void readData()  {
		
	}
}

class C extends A{

	
}