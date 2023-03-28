package com.capgemini.collection;

import java.util.Stack;

public class CollectionDemo8 {
			/*  vector is Synchronized collection where ArrayList is non Synchronized
			 * a.l fast vector slow*/
			// in stack there is first in last out (FILO)
			// the example for this is bangles  
			// the underlying ds  in stack is stack 
			// push();
			// pop();  method
			// when a stack is first created it contains no items
			
	public static void main(String[] args) {
		
		Stack s = new Stack();// only one constructor Stack();
		s.push(10);
		s.push(45);
		s.push(true);
		s.push(null);// Heterogeneous + duplicate + null allowed
		s.push(null);
		s.push("anil");
		System.out.println(s);
		s.pop();// it will remove the last entered element from stack here it will remove anil
		System.out.println(s);
		Object obj = s.peek();
		System.out.println(obj);// it will print the top element of stack here it is null
		System.out.println(s.empty());// false as stack is not empty
		System.out.println(s.search(10));// prints 5 as it will count from top
	}

}
