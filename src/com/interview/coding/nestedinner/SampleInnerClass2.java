package com.interview.coding.nestedinner;

public class SampleInnerClass2 {

	
	public static void main(String[] args) {
		
		Person person = new Person() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Eatable eatable= new Eatable() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}
	
}


 
abstract class Person{	  
	  abstract void eat();  
} 


interface Eatable{  
 void eat();  
}  