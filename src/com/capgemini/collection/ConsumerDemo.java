package com.capgemini.collection;

import java.util.function.Consumer;

		// it is also functional interface like predicate and function but 
		// its method do not have a return type 
		// void accept(); method 
		// it only consume and returns nothing 
		/*Consumer<T> is an  in built functional interface introduced in java 8 
		 * it can be used in all context where object needs to be consumed 
		 * I.e take as input and some operation is to be performed on the object
		 *without returning the result 
		 * 
		 * */
public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> obj  = (str)-> System.out.println(str);
		obj.accept("Akash dubey");

	}

}
