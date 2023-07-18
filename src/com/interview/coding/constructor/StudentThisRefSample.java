package com.interview.coding.constructor;

public class StudentThisRefSample {

	
	int data =10; 
	
	void sampleMethod1(StudentThisRefSample refSample) {
		System.out.println("Mehtod is invoked sampleMethod1");
	}
	
	void sampleMethod2() {
		System.out.println("Mehtod is invoked sampleMethod2");
		sampleMethod1(this);  // Rule 4: this: to pass as an argument in the method
	}
	
	public static void main(String[] args) {
		StudentThisRefSample refSample=new StudentThisRefSample();
		refSample.sampleMethod2();
		
		SampleTest smTest = new SampleTest(refSample);
	}
}


class SampleTest{
	
	private StudentThisRefSample refSample;
	
	public SampleTest(StudentThisRefSample refSample) {
		this.refSample= refSample;
	}
	
	void display() {
		System.out.println(refSample.data);
	}
}
