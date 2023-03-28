package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamApiDemo15 {

	public static void main(String[] args) {
	// fliter() map() flatMap() distinct() limit() all these are non terminal methods used to process the data
		// the non terminal methods will return the stream of object
		// on the stream we can apply the terminal operation
		// collect() count() min() max() forEach() toArray() to terminal operation
		// distinct() count() limit()
		// i want the distinct data (no duplicate)
		// non terminal methods are processing method
		
		List<String> vehicle = Arrays.asList("bus","car", "bycle","car","car","bike");
		
		List<String> vehicle1 = new ArrayList<>();
		vehicle1= vehicle.stream().distinct().collect(Collectors.toList());
		System.out.println(vehicle1);// op [bus, car, bycle, bike]
		// or
		//vehicle.stream().distinct().forEach(n-> System.out.println(n));
		// or
		// vehicle.stream().distinct().forEach(System.out:: println);
		// if i want to count how many distinct elements are in vehicle
		  long result =vehicle.stream().distinct().count();
		  System.out.println(result);
		  // limit() non terminal method 
		  // here i want to collect some limited object
		  vehicle.stream().limit(3).forEach(System.out:: println);
		  // op bus car bycle 
		  
	}

}
