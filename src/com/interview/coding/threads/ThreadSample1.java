package com.interview.coding.threads;

public class ThreadSample1 {

	public static void main(String[] args) {
	
		ThreadSampleA a= new ThreadSampleA();
		a.start();
		
		
		Thread t2 = new Thread("String Param Thread");
		t2.start();
		String threadName=t2.getName();
		System.out.println(threadName);
		
		
		
	}
	
}


class ThreadSampleA extends Thread{
	
	@Override
	public void run() {
		System.err.println("Thread Start");
	}
}
