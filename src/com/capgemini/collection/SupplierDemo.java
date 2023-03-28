package com.capgemini.collection;

import java.util.function.Supplier;

// Supplier supplies but consume nothing 
		// it have return type but no input type
		// it have get method
		//T get() method 
		/*Supplier can be used in all the context where there is no input but an output is expected 
		 * */
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> obj = ()-> "Supplier interface consumes nothing just supplies ";
		System.out.println(obj.get());
			// op isSupplier interface consumes nothing just supplies 
	}

}
