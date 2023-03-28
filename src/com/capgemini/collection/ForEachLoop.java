package com.capgemini.collection;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(4,5,7,8,9);// here i have created a list as an array
		// now i want to retrieve data from list using different different loops 
		// 1st is using  for loop
		System.out.println("here i am using for loop to print the list");
		for(int i =0; i<5;i++) {
			System.out.println(l.get(i));// here we are using index value 
		}
		System.out.println("here i am using for enhaned loop to print the list");
		for(int n:l) {
			// how enhanced for loop works 
			// it will not use index value it will simply fetch values from list l 
			// and take one value at a time from list and put it into n 
			// every time it iterates it jumps from value to value 
			System.out.println(n);// first prints 4 then 5 then 
			
		}
		System.out.println("here i am printing list using foreach method ");
		// above both loops are external loops now we will use an internal loop 
		l.forEach(n-> System.out.println(n));// this method was introduced in java 8 forEach() method
		// here forEcah will through the value the value will be excepted by n then we will print n
		// here forEch will fetch value from list and will give the value 
		// it is very good method you do not need any iterator to iterate the the 
		// list element if u have  this method 
	}

}
