package com.interview.coding.nestedinner;

public class SampleInnerClass3 {


	 int x=10;
	
	void makeSomeClass() {
		
		class LocalInnerClass{
			void localInnserClassMethos() {
				System.out.println("Local Inner Class");
			}
			
		}
		LocalInnerClass localInnerClass= new LocalInnerClass();
		localInnerClass.localInnserClassMethos();
	}
	
	public static void main(String[] args) {
		
	SampleInnerClass3 sc3= new SampleInnerClass3();
	System.err.println(sc3.x);
	sc3.makeSomeClass();
}
}


 