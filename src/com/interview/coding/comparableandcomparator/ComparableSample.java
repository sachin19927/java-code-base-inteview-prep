package com.interview.coding.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparableSample {

	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "A", 110));
		students.add(new Student(1, "A", 10));
		students.add(new Student(1, "A", 0));
		students.add(new Student(1, "A", 5));
		students.add(new Student(1, "A", 120));
		students.add(new Student(1, "A", 40));
		
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
	}
}


class Student implements Comparable<Student> {  
int rollno;  
String name;  
int age;  


Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}


@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}


@Override
public int compareTo(Student student) {

	if(age== student.age)
	return 0;
	
	else if(age>student.age)  
		return 1;  
	else
		return -1;
	
}



}