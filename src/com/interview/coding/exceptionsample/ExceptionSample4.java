package com.interview.coding.exceptionsample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample4 {

	
	 void m() throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
	
	  void n() throws IOException{  
		    m();  
		  }  
	  
	  
	  void p(){  
		   try{  
		    n();  
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   System.out.println("exception handeled");}  
		  }  
	 
	public static void main(String[] args) {

		System.out.println("Flow start");
		ExceptionSample4 sample4 = new ExceptionSample4();
		sample4.p();
		System.out.println("Flow end");
		
		
	}
}
