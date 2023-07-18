package com.interview.coding.constructor.inheritance.multiple;

class Animal {

	void sound()
	{
		System.out.println("Makes Noise");
	}
}

class Dog extends Animal{
	
	@Override
	void sound() {
		System.err.println("It barks");
	}
	
	void eat() {
		System.err.println("Normal food");
	}
}


class GermanShepard extends Dog{
	

	@Override
	 void eat() {
		System.err.println("eats Royal canin");
	}
}


public class MultiLevelIneritanceSample{
	
	public static void main(String[] args) {
		
		Animal ref1= new Animal();
		ref1.sound();
		
		Animal ref2= new Dog();
		ref2.sound();
		//ref2.eat();   Not acciable to 
		
		Dog ref3= new Dog();
		ref3.sound();
		ref3.eat();
		
		GermanShepard ref4 = new GermanShepard();
		ref4.sound();
		ref4.eat();
		
		Dog ref5 = new GermanShepard();
		ref5.sound();
		ref5.eat();
		
		
		Animal ref6= new GermanShepard();
		ref6.sound();
	}
}