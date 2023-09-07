package com.interview.coding.practical.interviewquestion;

import java.util.List;
import java.util.stream.Collectors;

import com.interview.coding.constructor.Java8.streams.Employee;

public class StreamProgramToGetResultInList {

	public static void main(String[] args) {
		
		EmployeeDataDump employeeDataDump = new EmployeeDataDump();
		
		List<Employee> collectOne = employeeDataDump.employeeData.stream()
			.distinct()
			.collect(Collectors.toList());
		
		List<Employee> collectTwo = employeeDataDump.employeeData.stream()
				.distinct().toList();
		
		System.err.println(collectOne);
		System.out.println(collectTwo);
		
	}
}
