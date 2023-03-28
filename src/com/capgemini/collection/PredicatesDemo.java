package com.capgemini.collection;

import java.util.function.Predicate;

// Predicate(I)
		// it is a predefined functional interface provided by java 
		// Function(I) ,Consumer(I), Supplier(I)  predicate(I)all these are  
		//also the  predefined functional interface 
		//present in java.util.function
		// it have only  one method that is (as functional interface )
		// boolean test(T t);
		// it have one parameter(it takes one parameter)  returns boolean
		// go for this interface when u have any condition to check
		// here i will check weather salary is greater than 4000 or not using test method 
		/*this functional interface is used for conditional check 
		 * where u think we can use these true false returning functions in day to 
		 * day programming we should chose predicate
		 * 
		 * */
public class PredicatesDemo {

	public static void main(String[] args) {
		int salary = 5000;
		Predicate<Integer>  p = (i) -> i>= 4000;
		
		boolean result = p.test(salary);
		System.out.println(result);// true 

	}

}
