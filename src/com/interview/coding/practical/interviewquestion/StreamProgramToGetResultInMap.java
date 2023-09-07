package com.interview.coding.practical.interviewquestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.interview.coding.constructor.Java8.streams.Employee;

public class StreamProgramToGetResultInMap {

	public static void main(String[] args) {
		
		EmployeeDataDump employeeDataDump = new EmployeeDataDump();
		
		Map<Integer,Employee> collectOne = employeeDataDump.employeeData.stream()
				.distinct()
				.collect(Collectors.toMap(Employee::getEmpID , x-> x));
		
		Map<Employee,Integer> collectTwo = employeeDataDump.employeeData.stream()
				.distinct()
				.collect(Collectors.toMap(x->x, Employee::getEmpID));
		
	}
}
