package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo5 {

	public static void main(String[] args) {
		// the length of the name must  be greater than 6 and less than 8
		List<String> names = Arrays.asList("akash","manisha", "jhhggagagag","jhon");
		List<String> longNames = new ArrayList<String>();
//		longNames =names.stream().filter((str)->str.length()>6 && str.length()<8).collect(Collectors.toList());
//		System.out.println(longNames);
		// or
		//names.stream().filter(str-> str.length()>6 & str.length()<8).forEach(n-> System.out.println(n));
		//or
		names.stream().filter(str-> str.length()>6 & str.length()<8).forEach(System.out:: println);
	}

}
