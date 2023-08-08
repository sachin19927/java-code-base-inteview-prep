package com.interview.coding.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorSample {

	
	public static void main(String[] args) {
		
		
List<Person> person = new ArrayList<>();
		
person.add(new Person(1, "X", 110));
person.add(new Person(1, "B", 10));
person.add(new Person(1, "Y", 0));
person.add(new Person(1, "C", 5));
person.add(new Person(1, "Z", 120));
person.add(new Person(1, "A", 40));
		
		System.out.println(person);
		Collections.sort(person,new AgeComparator());
		System.out.println(person);
		Collections.sort(person,new NameComparator());
		System.out.println(person);
		
		List<Person> personNew = new ArrayList<>();
		
		personNew.add(new Person(1, "X", 110));
		personNew.add(new Person(1, "B", 10));
		personNew.add(new Person(1, "Y", 0));
		personNew.add(new Person(1, "C", 5));
		personNew.add(new Person(1, "Z", 120));
		personNew.add(new Person(1, "A", 40));		
		
		
		List<Person> collectNewPersonAsc = personNew.stream().sorted((x,y)-> x.age-y.age).collect(Collectors.toList());
		List<Person> collectNewPersonDsc = personNew.stream().sorted((x,y)-> y.age-x.age).collect(Collectors.toList());
		List<Person> collectNewPersonname = personNew.stream().sorted((x,y)-> x.name.compareTo(y.name)).collect(Collectors.toList());
		
		System.out.println(personNew);
		System.out.println(collectNewPersonAsc);
		System.out.println(collectNewPersonDsc);
		System.out.println(collectNewPersonname);
		
		
		
	}
}


class Person {
	
int rollno;  
String name;  
int age;

Person(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}

@Override
public String toString() {
	return "Person [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}  


}

class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
	
		
		if(p1.age==p2.age)  
			return 0;  
	    else if(p1.age>p2.age)  
			return 1;  
	    else  
			return -1;  
		
	}
	
}

class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
	
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
	    return p1.name.compareTo(p2.name); 
		
	}
	
}