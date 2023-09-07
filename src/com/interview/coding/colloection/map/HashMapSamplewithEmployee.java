package com.interview.coding.colloection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapSamplewithEmployee {

	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Bindisha", "Mumbai");
		Employee emp2 = new Employee(1, "Bindisha", "Mumbai");
		System.err.println(emp1.hashCode());
		System.err.println(emp2.hashCode());
		
		
		Map<Employee, String> empMap= new HashMap<>();
		empMap.put(emp1, "Emp Onboarded");
		empMap.put(emp2, "Emp Left Org");
		System.err.println(empMap);
		
		
		System.out.println(emp1.equals(emp1));
		System.out.println(emp1.equals(null));
		System.out.println(emp1.equals(emp2));
		
		Map<String, String> stringMap= new HashMap<>();
		stringMap.put("bins", "Emp Onboarded");
		stringMap.put("bins", "Emp Left Org");
		System.err.println(stringMap);
		
		System.err.println(stringMap.get("bins"));
	}
}



class Employee{
	int rollNo;
	String name;
	String address;
	
	public Employee(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo,name,address);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
            return false;
		Employee otherEmployee = (Employee) obj;
		return rollNo == otherEmployee.rollNo 
				&& name.equals(otherEmployee.name) 
				&& address.equals(otherEmployee.address);
	}
	
}