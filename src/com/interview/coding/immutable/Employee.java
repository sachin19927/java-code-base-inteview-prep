package com.interview.coding.immutable;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class Employee {   // Step 1: make class final so it can't be extended to make it Immutable
	
	private final String empName; // Step 2: make all data members private and final so it can't be modified 
	private final int age;
	private final Date dateOfBirth;
	private final LocalDate onboardingDate;
	private final List<String> lang;
	private final Address address;
	
	public Employee(String empName, int age, Date dateOfBirth, LocalDate onboardingDate, List<String> lang,
			Address address) { // step 3: Create parameterized constructor to initialize the data member
		this.empName = empName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.onboardingDate = onboardingDate;
		this.lang = lang;
		this.address = address;
	}
	
	

	public String getEmpName() { //Step4: create only getter methods no setters so data can't be modifiable
		return empName;
	}

	public int getAge() {
		return age;
	}

	public Date getDateOfBirth() {
		return new Date(this.dateOfBirth.getTime()); // Step 5: If any mutable object is there return copy of object not the direct object since it can be modifiable 
	}

	public LocalDate getOnboardingDate() {
		return onboardingDate;
	}

	public List<String> getLang() {
		return Collections.unmodifiableList(lang);
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address)address.clone();  // Step 6: If any custom class is being used as data member to avoid it's modification Implement Custom class with Clonable interface and override clone method so it can return it's clone object
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", onboardingDate="
				+ onboardingDate + ", lang=" + lang + ", address=" + address + "]";
	}
	
	
	
	
}
