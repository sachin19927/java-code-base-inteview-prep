package com.interview.coding.instanceofsample;

public class InstanceOfSampleCode {

	
	public static void main(String[] args) {
		
		Student stu = new Student(10, "sachin");
		Employee emp = new Employee(10, "sachin");
		
		Object obj1 = new Student(10, "sachin");
		Object obj2 = new Employee(10, "sachin");
		
		System.out.println(stu instanceof Student);
		//System.err.println(stu instanceof Employee);   // CT EXP
		System.out.println(emp instanceof Employee);
		//System.err.println(emp instanceof Student);    // CT EXP
		
		
		System.out.println(obj1 instanceof Student);
		System.out.println(obj1 instanceof Employee);
		System.out.println(obj2 instanceof Student);
		System.out.println(obj2 instanceof Employee);
		
		
		
		
		if(obj1 instanceof Employee) {
			System.err.println("EMPLOYEEE");
		}
		else if(obj1 instanceof Student)
		{
			System.err.println("STUDENT");
		}
		
		
		Student stuNew=null;
		System.out.println( stuNew instanceof Student);
		
		
		System.out.println("**********************************");
		
		Animal animal = new Dog();
	
		Dog.testMethodForDownCasting(animal);
	}
	
	
	
}


class Student{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
}


class Employee{
	int rollno;
	String name;
	public Employee(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
}


class Animal {
	
	void makeSound()
	{
		System.err.println("Make noise");
	}
}

class Dog extends Animal{
	
	static void testMethodForDownCasting(Animal animal)
	{
		if(animal instanceof Dog)
		{
			Dog dog= (Dog)animal;
		}
		
		System.out.println("ok downcasting performed"); 
	}
}