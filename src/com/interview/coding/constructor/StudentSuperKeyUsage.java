package com.interview.coding.constructor;

class Company{
	
	String role="Employee";
	double experience=0.0;
	
	void getCompanyEmployeeDetails() {
		System.out.println("Company method logic");
	}
	
	public Company() {
		System.out.println("Company def Constructor");
	}
	
}

class Employee extends Company{
	
	String role="Software Eng";
	double experience=4.0;
	
	public Employee() {
		super();
		System.out.println("Employee def construcotor");
	}
	
	@Override
	void getCompanyEmployeeDetails() {
		
		super.getCompanyEmployeeDetails();
		System.out.println("Employee class method");
		System.err.println(super.role);
	}
}



public class StudentSuperKeyUsage {

	public static void main(String[] args) {
		
		Company comp= new Company();
		System.out.println(comp.role);
		System.out.println(comp.experience);
		comp.getCompanyEmployeeDetails();
		System.out.println("******************-------------------------********");
		Employee emp = new Employee();
		System.out.println(emp.role);
		System.out.println(emp.experience);
		emp.getCompanyEmployeeDetails();
	}
	
}