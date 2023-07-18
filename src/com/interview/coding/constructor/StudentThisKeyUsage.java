package com.interview.coding.constructor;

public class StudentThisKeyUsage {

	
	int rollNo;
	String name;
	String city;
	
	public StudentThisKeyUsage() {
		this(0,null,null);
	}
	
	public StudentThisKeyUsage(int rollNo, String name, String city) {
		
		this(rollNo,name); // reusing constructor chaining 
		this.city = city;
	}
	
	public StudentThisKeyUsage(int rollNo) {
		this();// Rule 3: this() : to invoke current class constructor
		System.out.println(rollNo);
	}
	
	
	void methodOne() {
		System.out.println("Calling Method one");
	}
	
	void methoTwo() {
		System.out.println("Calling Method two");
		methodOne();
		this.methodOne(); // Rule 2: this: to invoke current class method
	}
	
	public StudentThisKeyUsage(int rollNo, String name) {
		this.rollNo = rollNo;  // Rule 1: this: to refer current class instance variable
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentThisKeyUsage [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		
		StudentThisKeyUsage ref1 = new StudentThisKeyUsage(10);
		System.out.println(ref1);
		StudentThisKeyUsage ref2 = new StudentThisKeyUsage();
		System.out.println(ref2);
		StudentThisKeyUsage ref3 = new StudentThisKeyUsage(10,"SACHIN","HASSAN");
		System.out.println(ref3);
		
		ref3.methoTwo();
	}
	
}
