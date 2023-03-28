package com.capgemini.collection;

import java.util.function.Function;

// function(I) it is interface and it can return any thing
public class FunctionDemo {

	public static void main(String[] args) {
		String s = "Akash Dubey";
		Function<String , Integer> obj = (str)->str.length();
		// here String in type of input parameter and Integer is of output parameter 
		// apply is method of Function interface who is predefined functional interface 
		// apply can have any return type 
		int length = obj.apply(s);
		System.out.println(length);
	}

}
