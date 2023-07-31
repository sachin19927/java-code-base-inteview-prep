package com.interview.coding.nestedinner;

public class SampleInnerClass1 {

	
	public static void main(String[] args) {
		SampleNestedClass1 sc1= new SampleNestedClass1();
		sc1.msg();
		
		SampleNestedClass1.SampleNestedClassA sc2= sc1.new SampleNestedClassA();
		sc2.msg();
		
	}
	
}


 class SampleNestedClass1{
	
	private int a=10;
	 
	void msg() {
		System.out.println("Parent Class");
		
	}
	
	public class SampleNestedClassA{
		void msg() {
			System.out.println("Innner Class");
			System.err.println(a);
		}
	}
	
	interface SampleNestedInterfaceB{
		
	}
	
}


interface SampleInnerInterface1{
	

    interface SampleInnerInterfaceA{
		
	}
    
    class SampleInnerClassB{
    	
    }
}
