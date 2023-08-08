package com.interview.coding.colloection;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackSample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.add("A");
		stack.push("F");
		stack.push("D");
		stack.add("E");
		stack.add("C");
		stack.push("B");
		
		Iterator<String> iterator = stack.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.err.println(stack);
		System.err.println(stack.peek());
		
		System.err.println(stack);
	}
}
