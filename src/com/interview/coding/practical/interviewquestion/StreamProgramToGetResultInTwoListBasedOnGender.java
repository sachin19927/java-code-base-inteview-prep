package com.interview.coding.practical.interviewquestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.interview.coding.constructor.Java8.streams.Employee;

public class StreamProgramToGetResultInTwoListBasedOnGender {

	public static void main(String[] args) {
		
		EmployeeDataDump dataDump = new EmployeeDataDump();
		
		Map<Boolean, List<Employee>> listOfData = dataDump.employeeData.stream()
									.collect(Collectors.partitioningBy(x-> x.getGender().equals("men")));
		
		
		List<Employee> genderMen = listOfData.get(true);
		List<Employee> genderWomen = listOfData.get(false);
		
		System.err.println(genderMen);
		System.out.println(genderWomen);
		
	}
}
