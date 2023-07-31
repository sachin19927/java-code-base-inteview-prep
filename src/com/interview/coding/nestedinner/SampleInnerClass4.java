package com.interview.coding.nestedinner;

public class SampleInnerClass4 {


	static int x=10;
	int y=10;
	
	static class StaticInnerClass{
		
		 void msg() {
			System.err.println(x);
		}
	}
	
	public static void main(String[] args) {
		
		SampleInnerClass4.StaticInnerClass ref=	new SampleInnerClass4.StaticInnerClass();
		
		ref.msg();
	}
	
	
}


 