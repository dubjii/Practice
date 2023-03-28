package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo8 {

	public static void main(String[] args) {
		// map it is a method present in stream class 
		// map we perform opreration on each object using map(an intermediate operation)
		//here i want to convert all the names to upper case then store them or print them
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight", "train");
		// without streams
		List<String> vehicleUpperCase = new ArrayList<String>();
//		for(String name:vehicles ) {
//			vehicleUpperCase.add((name).toUpperCase());
//		}
//		System.out.println(vehicleUpperCase);
	// with streams
		// map will take a function 
		// if i want to  store them to another list
		//vehicleUpperCase=vehicles.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
		//System.out.println(vehicleUpperCase);
		// or if i want to print them 
		vehicles.stream().map(name-> name.toUpperCase()).forEach(System.out::println);
	}

}
