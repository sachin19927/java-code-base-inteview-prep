package com.interview.coding.constructor.inheritance.hierarchical;


class Animal{
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


class Cat extends Animal{
	
	@Override
	void sound() {
		System.err.println("It Meows");
	}
}


public class HierachicalInteritnaceSample {

public static void main(String[] args) {
	
}	
}
