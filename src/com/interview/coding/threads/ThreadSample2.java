package com.interview.coding.threads;

public class ThreadSample2 {

	public static void main(String[] args) {
		
		ThreadSampleB b= new ThreadSampleB();
		//b.run();
		
		Thread t1 = new Thread(b);
		t1.start();
		System.out.println(t1.getName());
		
		Thread t2 = new Thread(b,"Custom Thread 1");
		
		t2.start();
		System.out.println(t2.getName());
		//t2.start();
		
		
		  for (int i = 0; i < 10; i++) { 
			  Thread t3 = new Thread(b,"Custom Thread "+i);
			  t3.start();
			  System.out.println(t3.getName()); 
			  }
		 

	}	

}

class ThreadSampleB implements Runnable{
	
	@Override
	public void run() {
		System.err.println("Thread Start ");
	}
}