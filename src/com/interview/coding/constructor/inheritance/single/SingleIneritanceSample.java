package com.interview.coding.constructor.inheritance.single;



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
}

public class SingleIneritanceSample{
	
	public static void main(String[] args) {
		
		Animal ref1= new Animal();
		ref1.sound();
		
		Animal ref2= new Dog();
		ref2.sound();
		
		Dog ref3= new Dog();
		ref3.sound();

		Dog ref4= (Dog) new Animal();
		ref4.sound();   // RT Exception
	
	}
}

