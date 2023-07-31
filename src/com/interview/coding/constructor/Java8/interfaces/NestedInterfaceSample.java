package com.interview.coding.constructor.Java8.interfaces;

public class NestedInterfaceSample {

}

interface OuterNested{
	
	void test1();
	
	interface InnerNested{
		
		void test2();
	}
}


class C implements OuterNested,OuterNested.InnerNested{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}