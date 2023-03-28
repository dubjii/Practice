package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo6 {

	public static void main(String[] args) {
		// i have some data containing some null values so i want the data without the null value 
		List<String> data = Arrays.asList("joy","manish",null,"syali",null,"jagruti");
		
		List<String> names = new ArrayList<String>();
//		names = data.stream().filter((w) -> w!= null).collect(Collectors.toList());
//		System.out.println(names);
		// or
		//data.stream().filter(w->w!=null).forEach(str -> System.out.println(str));
		//or
		data.stream().filter(w-> w!= null).forEach(System.out::println);
	}

}
