package com.interview.coding.practical.interviewquestion;

public class StreamProgramToGetThirdHigeshtPaidSalary {

	public static void main(String[] args) {
		
		EmployeeDataDump dataDump= new EmployeeDataDump();
		
		dataDump.employeeData.stream()
		.sorted((a,b)->b.getSalary().compareTo(a.getSalary()))
				.skip(2)
				.limit(1)
				.forEach(x->System.out.println(x.getSalary()));
	}
}
