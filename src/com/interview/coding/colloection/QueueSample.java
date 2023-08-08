package com.interview.coding.colloection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Z");
		queue.add("X");
		queue.add("Y");
	
		queue.forEach(x->System.out.println(x));
		System.out.println(queue);
		queue.poll();
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		queue.poll();
		System.out.println(queue);
		
		
		Queue<String> arrdeQue = new ArrayDeque<>();
		arrdeQue.add("Z");
		arrdeQue.add("X");
		arrdeQue.add("Y");
		arrdeQue.poll();
		System.out.println(arrdeQue);
		arrdeQue.poll();
		System.out.println(arrdeQue);
		arrdeQue.poll();
		System.out.println(arrdeQue);
		arrdeQue.poll();
		System.out.println(arrdeQue);
	
	}
	
}
