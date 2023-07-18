package com.interview.coding.staticnonstatic;

public class StudentStaticExample {

	int rollNo;
	String firstName;
	String lastName;
	static String college="GECH";     // Static variable class level mempery available in class area
	static String place;
	static int pinCode;
	
	static {       //static block used intialize static data and call static mehods no this and super key inside static block
		System.out.println("Statis Block");
		place="HASSAN";
		getStduent(); //calling static Method directly 
 	} //called only once
	
	
	static void getStduent() {
		System.out.println("Inside Static Method");
		StudentStaticExample stuEx1= new StudentStaticExample();  // creating object to call non static data
		System.err.println(stuEx1.firstName);
		System.err.println(stuEx1.lastName);
		
	}
	
	public static void main(String[] args) {  // Main is static block identified by JVM start part pgm 
		System.out.println("Main Method");
		StudentStaticExample stuEx1= new StudentStaticExample();
		System.out.println(stuEx1);
		System.out.println("Place :" +place);
		System.out.println("Pincode :" +pinCode);
		
		StudentStaticExample stuEx2= new StudentStaticExample(1,"sachin","gowda");
		StudentStaticExample.pinCode=573201;
		System.out.println(stuEx2);
		System.out.println("Place :" +place);
		System.out.println("Pincode :" +pinCode);
		stuEx2.getNonStaticData(stuEx1);
		
	}
	
	public StudentStaticExample(int rollNo, String firstName, String lastName) {
		System.out.println("ParaMeter Constructor");
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public StudentStaticExample() {
		System.out.println("DefaultConstructor");
	}
	
	{ // Non static block called before each constructor call
		System.out.println("Non Static Block");
		this.firstName="Sachin";
		this.lastName="HS";
	}
	
	void getNonStaticData(StudentStaticExample example) {
		System.out.println("Non static Method");
		System.out.println(example);
		System.out.println(place);
	}


	@Override
	public String toString() {
		return "StudentStaticExample [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}



	
	
}

