package com.interview.coding.constructor.Java8.interfaces;

public class FunctionalInterfaceSample {

	public static void main(String[] args) {
		
		Calculaator cal = new ArthmaticClass();
		int result = cal.calculate(10);
		System.out.println("Result Using Old ways :"+result);
		
		Calculaator cal1 = new Calculaator() {
			
			public int calculate(int i) {
				return i*3;
			};
		};
		
		int result1 = cal1.calculate(10);
		System.out.println("Result Using Annomus inner calss:"+result1);
		
		
		Calculaator cal2 = x-> x*5;
		int result2 = cal2.calculate(10);
		System.out.println("Fucntional Interface lmada:"+result2);
		
		
		Calculaator cal3 = x-> x*5;
		int result3 = cal3.calculate(10);
		System.out.println("Fucntional Interface lmada 3:"+result3);
		
		
		CalculaatorNew calNew = new CalculaatorNew() {
			
			public int calculate(int i, int j) {
				return i + j;
			};
		};
		
		int resultNew = calNew.calculate(10,20);
		System.out.println("Fucntional Interface lmada New:"+resultNew);
		
		CalculaatorNew calNew1 = (i,j)->  i / j;
		
		int resultNew1 = calNew1.calculate(20,20);
		System.out.println("Fucntional Interface lmada New1:"+resultNew1);
		
		
		Printer print = new Printer() {
			
			@Override
			public void print(int i) {
				System.err.println("Print the value:"+i);
			}
			
			public  double calcluate(int x, double y) {
				return x*y;
			};
		};
		
		print.print(100);
		
		Printer print1 = i -> System.err.println("print value : "+ i);
		print1.print(1000);
		
		Printer.calcluate(12.0, 34);
		
	}
	
}

@FunctionalInterface
interface Calculaator{
	
	int calculate(int i) ;
	
	default double calcluate(int x,double y) {
		return x+y;
	}
	
	static double calcluate(double x,double y) {
		return x+y;
	}
}

interface Printer{
	
	void print(int i) ;
	
	default double calcluate(int x,double y) {
		return x+y;
	}
	
	static double calcluate(double x,double y) {
		return x+y;
	}
}


@FunctionalInterface
interface CalculaatorNew{
	
	int calculate(int i,int j) ;
	
	default double calcluate(int x,double y) {
		return x+y;
	}
	
	static double calcluate(double x,double y) {
		return x+y;
	}
	
}

class ArthmaticClass implements Calculaator{

	@Override
	public int calculate(int i) {
		return i+10;
	}
	
}