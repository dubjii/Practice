package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo4 {

	public static void main(String[] args) {
		//filter filtering data based on certain condition
		//stream is used to process the data
		//
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(15);
//		al.add(20);
//		al.add(25);
//		al.add(30);
//		// in the above first i  created arraylist then added the no to them i can do it in single 
		// step also like the below
		// in java .util we have specail class Arrays class by using this class we can create our own collection
		//dynamically using asList method
		
		List <Integer>  al = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		// this is empty list
		// without using streams we can do it with help of for loop
		// when we work with stream we do not modify the source collection we create our own stream and modify data there
		//
		//al.stream(); // here i added my data to stream
		// filter method alwyas takes a boolean expression as a parameter
		// here i am using lambda n is parameter passing
		// collecting data by using collect method 
		//evenNumbersList =al.stream().filter(n->n%2 ==0).collect(Collectors.toList());
		//System.out.println(evenNumbersList);
		// or i can short this thing even more
		// in for each it is taking a consumer as a argument
		//al.stream().filter(n-> n%2 ==0).forEach(n-> System.out.println(n));
		// or i can do it like
		al.stream().filter(n-> n%2 ==0).forEach(System.out::println);
		// filterdemo 2 multiple condition
		
		
		
		
		
		
		
		
	}

}
