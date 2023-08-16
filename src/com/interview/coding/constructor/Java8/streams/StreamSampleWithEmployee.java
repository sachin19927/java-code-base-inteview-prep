package com.interview.coding.constructor.Java8.streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamSampleWithEmployee {

	
	List<Employee> employeeData = Arrays.asList(
			new Employee(505, "Jim", "Plamer", "jimplamer@gmail.com","men", 24, LocalDate.of(1992, 9, 7), 35000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(1000, "Asta", "blackBull", "astabull@gmail.com","men", 18, LocalDate.of(1999, 12, 7), 5000.0, false, LocalDate.of(2021, 12, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(23, "Goku", "Saiyan", "gokesaiyan@gmail.com","men", 30, LocalDate.of(1993, 9, 7), 335000.0, true, LocalDate.of(2010, 3, 8), LocalDate.of(2023, 7, 8), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(5, "Naruto", "Uzumaki", "narutouzumaki@gmail.com","men", 20, LocalDate.of(2002, 9, 7), 35000.0, false, LocalDate.of(2014, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(50023, "black", "Panther", "blackpanther@gmail.com","men", 35, LocalDate.of(1992, 9, 7), 334000.0, true, LocalDate.of(2012, 3, 8), LocalDate.of(2023, 3, 8), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(400, "Tony", "Stark", "ironman@gmail.com","men", 45, LocalDate.of(1970, 9, 7), 3445000.0, true, LocalDate.of(2002, 3, 8), LocalDate.of(2022, 3, 8), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(55, "Star", "Lord", "starlord@gmail.com","men", 50, LocalDate.of(1960, 9, 7), 3565000.0, true, LocalDate.of(2001, 3, 8), LocalDate.of(2023, 8, 8), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(555, "Chris", "Evans", "capatinamerica@gmail.com","men", 110, LocalDate.of(1915, 9, 7), 335000.0, true, LocalDate.of(2017, 3, 8), LocalDate.of(2023, 2, 18), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(111, "Chris", "Pat", "chrispatt@gmail.com","men", 50, LocalDate.of(1977, 9, 7), 1235000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(333, "Chris", "Hemsworth", "thorodinson@gmail.com","men", 500, LocalDate.of(1500, 9, 7), 535000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(222, "Tom", "Hiddelston", "lokiodinsom@gmail.com","men", 300, LocalDate.of(1700, 9, 7), 635000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(44, "Tom", "Holland", "spiderman@gmail.com","men", 15, LocalDate.of(2005, 9, 7), 55000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(4324, "Hawk", "Eye", "hawkeye@gmail.com","men", 30, LocalDate.of(1990, 9, 7), 45000.0, true, LocalDate.of(2014, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(2, "Robert", "Pattison", "batman@gmail.com","men", 28, LocalDate.of(1987, 9, 7), 635000.0, false, LocalDate.of(2009, 3, 8), LocalDate.of(2017, 3, 8), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(595, "Robby", "Mquire", "barbie@gmail.com","women", 34, LocalDate.of(1988, 9, 7), 735000.0, false, LocalDate.of(2008, 3, 8), LocalDate.of(2015, 3, 8), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(345, "Leonard", "DiCarp", "jack@gmail.com", "men", 40, LocalDate.of(1978, 9, 7), 835000.0, false, LocalDate.of(2007, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(344, "Jim", "Plamer", "jimplamer@gmail.com", "men", 24, LocalDate.of(1992, 9, 7), 35000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(344, "Jim", "Plamer", "jimplamer@gmail.com", "men", 24, LocalDate.of(1992, 9, 7), 35000.0, true, LocalDate.of(2017, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(505, "Brad", "Pit", "bradpit@yahoo.com", "men",34, LocalDate.of(1987, 3, 7), 135000.0, false, LocalDate.of(2008, 12, 28), LocalDate.of(2000, 12, 28), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(505, "Brad", "Pit", "bradpit@yahoo.com", "men",34, LocalDate.of(1987, 3, 7), 135000.0, false, LocalDate.of(2008, 12, 28), LocalDate.of(2000, 12, 28), LocalDateTime.now(), LocalDateTime.now()),
			new Employee(4505, "Kim", "Kardshian", "kimmy@gmail.com","women", 26, LocalDate.of(1990, 9, 7), 35000.0, true, LocalDate.of(2018, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(46666, "Evan", "C", "evanc@gmail.com","men", 26, LocalDate.of(1992, 9, 7), 350000.0, true, LocalDate.of(2015, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(234234, "Rose", "Plamer", "rossy@gmail.com","women", 24, LocalDate.of(1996, 9, 7), 3000.0, true, LocalDate.of(2013, 3, 8), null, LocalDateTime.now(), LocalDateTime.now()),
			new Employee(234234, "Jim", "carry", "jimplamer@gmail.com","men", 60, LocalDate.of(1977, 9, 7), 305000.0, true, LocalDate.of(2005, 3, 8), LocalDate.of(2017, 3, 8), LocalDateTime.now(), LocalDateTime.now())
			);
	
	public static void main(String[] args) {
		
		StreamSampleWithEmployee streamSampleWithEmployee = new StreamSampleWithEmployee();
		
		StreamSampleWithEmployee.emplyoeeGreaterThen20andLessThen70(streamSampleWithEmployee.employeeData);
		
		streamSampleWithEmployee.femaleEmployee(streamSampleWithEmployee.employeeData);
		
		streamSampleWithEmployee.maleEmployeewithsalaryGreaterthen1Lac(streamSampleWithEmployee.employeeData);
		
		streamSampleWithEmployee.give20hikeToallEmployeesWhoAreStillInCompany(streamSampleWithEmployee.employeeData);
		
		streamSampleWithEmployee.sortEmplyoeeByJunrToSenior(streamSampleWithEmployee.employeeData);
		
		streamSampleWithEmployee.sortEmplyoeeBySenrToJunr(streamSampleWithEmployee.employeeData);
		
		streamSampleWithEmployee.sortEmplyoeeByEmpId(streamSampleWithEmployee.employeeData);

		streamSampleWithEmployee.getAllMenwithAgeGreaterThen25WhoArePermanentSortByName(streamSampleWithEmployee.employeeData);
		
		
	}
	
	
	public static List<Employee> emplyoeeGreaterThen20andLessThen70(List<Employee> employeeData){
		
		System.out.println("EmplyoeeGreaterThen20andLessThen70 : before stream :"+ employeeData.size());

		List<Employee> ageCreteria = employeeData.stream()
		.filter(x-> x.getAge()>=20 && x.getAge()<=70)
		//.collect(Collectors.toList());
		.toList();

		System.out.println(ageCreteria);
		System.out.println("EmplyoeeGreaterThen20andLessThen70 : after stream :"+ ageCreteria.size());
		return ageCreteria;
	}
	
	public List<Employee> femaleEmployee(List<Employee> employeeData){
		
		System.out.println("femaleEmployee : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.filter(x-> x.getGender().equalsIgnoreCase("WOMEN"))
		        .toList();
		System.out.println(list);
		System.out.println("femaleEmployee : before stream :"+ list.size());
		return list;
	}
	
	
	public List<Employee> maleEmployeewithsalaryGreaterthen1Lac(List<Employee> employeeData){
		
		System.out.println("maleEmployeewithsalaryGreaterthen5Lac : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.filter(x-> x.getGender().equalsIgnoreCase("men") && x.getSalary()>100000.0 )
		        .toList();
		System.out.println(list);
		System.out.println("maleEmployeewithsalaryGreaterthen5Lac : before stream :"+ list.size());
		return list;
	}
	
	
	public List<Employee> give20hikeToallEmployeesWhoAreStillInCompany(List<Employee> employeeData){
		
		System.out.println("give20hikeToallEmployeesWhoAreStillInCompany : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.filter(x-> x.getEmployeeExitDate()==null  )
				.map(this::hikeEmplyoee)
		        .toList();
		System.out.println(list);
		System.out.println("give20hikeToallEmployeesWhoAreStillInCompany : after stream :"+ list.size());
		return list;
	}

	
	public List<Employee> sortEmplyoeeByJunrToSenior(List<Employee> employeeData){
		System.out.println("sortEmplyoeeByJunrToSenior : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.sorted((a,b)->a.getAge()-b.getAge())
		        .toList();
		System.out.println(list);
		System.out.println("sortEmplyoeeByJunrToSenior : after stream :"+ list.size());
		return list;
	}

	public List<Employee> sortEmplyoeeBySenrToJunr(List<Employee> employeeData){
		System.out.println("sortEmplyoeeBySenrToJunr : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.sorted((a,b)->b.getAge()-a.getAge())
		        .toList();
		System.out.println(list);
		System.out.println("sortEmplyoeeBySenrToJunr : after stream :"+ list.size());
		return list;
	}

	public List<Employee> sortEmplyoeeByEmpId(List<Employee> employeeData){
		System.out.println("sortEmplyoeeByEmpId : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.sorted((a,b)->a.getEmpID()-b.getEmpID())
		        .toList();
		System.out.println(list);
		System.out.println("sortEmplyoeeByEmpId : after stream :"+ list.size());
		return list;
	}


	public List<Employee> getAllMenwithAgeGreaterThen25WhoArePermanentSortByName(List<Employee> employeeData){
		System.out.println("getAllMenwithAgeGreaterThen25WhoArePermanentSortByName : before stream :"+ employeeData.size());
		List<Employee> list = employeeData.stream()
				.filter(filterByGender("MEN"))
				.filter(filterByAge(25))
				.filter(filterEmpStatus(true))
				.sorted(sortByFirstName())
		        .toList();
		System.out.println(list);
		System.out.println("getAllMenwithAgeGreaterThen25WhoArePermanentSortByName : after stream :"+ list.size());
		return list;
	}
	
	private Employee hikeEmplyoee(Employee x) {
		return	new Employee(x.getEmpID(), x.getFirstName(), x.getLastName(), x.getEmailAddress(), 
				 x.getGender(), x.getAge(), x.getDob(), x.getSalary() + (x.getSalary()*0.20) , x.getTypeOfEmployee(), x.getEmployeeOnBoardDate(), x.getEmployeeExitDate(), x.getInsertedDateTime(), x.getModifiedDateTime());
	}
	
	private Predicate<Employee> filterByGender(String gender) {
		return emp -> emp.getGender().equalsIgnoreCase(gender);
	}
	
	private Predicate<Employee> filterByAge(Integer age) {
		return emp -> emp.getAge()>age;
	}
	
	private Predicate<Employee> filterEmpStatus(boolean type) {
		return emp -> emp.getTypeOfEmployee() == type ;
	}

	private Comparator<Employee> sortByFirstName() {
		return (empA,empB) ->	empA.getFirstName().compareTo(empB.getFirstName());
	}
	
	private Comparator<Employee> sortByLastName() {
		return (empA,empB) ->	empA.getFirstName().compareTo(empB.getFirstName());
	}
	
	private Comparator<Employee> sortByAge() {
		return (empA,empB) ->	empA.getFirstName().compareTo(empB.getFirstName());
	}
	
	private Comparator<Employee> sortByDob() {
		return (empA,empB) ->	empA.getDob().compareTo(empB.getDob());
	}
	
}
