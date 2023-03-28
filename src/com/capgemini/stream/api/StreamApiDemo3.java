package com.capgemini.stream.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo3 {

	public static void main(String[] args) {
		//  important methods of Stream
		// filter(predicate) it takes a predicate which is a boolean valued function
		// it returns true and false 
		// if it returns true collect the element
		// e->{ return true }
		// ex e-> e>10
		// map
		// with help of map we can perform operation on each element with help of this
		//map(function) it returns the element
		List<String> names = List.of("aman","Ankit" ,"akash","durga", "durgesh");
		// filter all the names Starting with A
		 Stream<String> stream =names.stream();
		List<String> newNames= stream.filter(e->e.toLowerCase().startsWith("a")).collect(Collectors.toList());
			System.out.println(newNames);
			// now i have a list and i want square of each no in that list
			List<Integer> numbers = List.of(5,6,7,7,8,9);
			Stream<Integer> stream1 = numbers.stream();
			List<Integer> list2=stream1.map(i-> i*i).collect(Collectors.toList());
			System.out.println(list2);
				
		
		// sort method
			numbers.stream().sorted().forEach(System.out:: println);
			Integer integer = numbers.stream().min((x,y)-> x.compareTo(y)).get();// finding minimum no
			System.out.println(integer);
			
			Integer integer1 = numbers.stream().max((x,y)-> x.compareTo(y)).get();// finding maximum no
			System.out.println(integer1);

	}

}
