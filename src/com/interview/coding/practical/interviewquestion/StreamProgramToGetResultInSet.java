package com.interview.coding.practical.interviewquestion;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.interview.coding.constructor.Java8.streams.Employee;

public class StreamProgramToGetResultInSet {

	public static void main(String[] args) {

		EmployeeDataDump employeeDataDump = new EmployeeDataDump();

		Set<Employee> collectOne = employeeDataDump.employeeData.stream()
				.distinct()
				.collect(Collectors.toSet());
		System.err.println(collectOne);
	}
}
