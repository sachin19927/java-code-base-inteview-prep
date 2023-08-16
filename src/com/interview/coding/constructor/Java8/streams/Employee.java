package com.interview.coding.constructor.Java8.streams;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
	
	private Integer empID;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String gender;
	private Integer age;
	private LocalDate dob;
	private Double salary;
	private Boolean typeOfEmployee;
	private LocalDate employeeOnBoardDate;
	private LocalDate employeeExitDate;
	private LocalDateTime insertedDateTime;
	private LocalDateTime modifiedDateTime;

	
	public Employee(Integer empID, String firstName, String lastName, String emailAddress,String gender, Integer age, LocalDate dob,
			Double salary, Boolean typeOfEmployee, LocalDate employeeOnBoardDate, LocalDate employeeExitDate,
			LocalDateTime insertedDateTime, LocalDateTime modifiedDateTime) {
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.gender=gender;
		this.age = age;
		this.dob = dob;
		this.salary = salary;
		this.typeOfEmployee = typeOfEmployee;
		this.employeeOnBoardDate = employeeOnBoardDate;
		this.employeeExitDate = employeeExitDate;
		this.insertedDateTime = insertedDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}

	

	public Integer getEmpID() {
		return empID;
	}



	public void setEmpID(Integer empID) {
		this.empID = empID;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public Boolean getTypeOfEmployee() {
		return typeOfEmployee;
	}



	public void setTypeOfEmployee(Boolean typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}



	public LocalDate getEmployeeOnBoardDate() {
		return employeeOnBoardDate;
	}



	public void setEmployeeOnBoardDate(LocalDate employeeOnBoardDate) {
		this.employeeOnBoardDate = employeeOnBoardDate;
	}



	public LocalDate getEmployeeExitDate() {
		return employeeExitDate;
	}



	public void setEmployeeExitDate(LocalDate employeeExitDate) {
		this.employeeExitDate = employeeExitDate;
	}



	public LocalDateTime getInsertedDateTime() {
		return insertedDateTime;
	}



	public void setInsertedDateTime(LocalDateTime insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}



	public LocalDateTime getModifiedDateTime() {
		return modifiedDateTime;
	}



	public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}



	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", gender=" + gender + ", age=" + age + ", dob=" + dob + ", salary=" + salary
				+ ", typeOfEmployee=" + typeOfEmployee + ", employeeOnBoardDate=" + employeeOnBoardDate
				+ ", employeeExitDate=" + employeeExitDate + ", insertedDateTime=" + insertedDateTime
				+ ", modifiedDateTime=" + modifiedDateTime + "]";
	}
	
	
	
	
}


