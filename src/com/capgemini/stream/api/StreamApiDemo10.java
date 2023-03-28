package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo10 {

	public static void main(String[] args) {
		// i have list of numbers i will multiply each element by 3 and then collect it into an other list
		List<Integer> numbers = Arrays.asList(2,3,4,5);
		List<Integer> numbers2 = new ArrayList<Integer>();
		// without using stream
//		for(int num : numbers){
//			numbers2.add(num = num*3);
//		}
//		System.out.println(numbers2);
//		
		// with stream
//		numbers2 =numbers.stream().map(num-> num*3).collect(Collectors.toList());
//		System.out.println(numbers2);
		//or
		// here i am using method reference
		// here in the for each method i am passing  a function as parameter in other function
		//example forEach(println) but it gives error we have to tell them the this method belongs to 
		// System class and out is object of System class  by double colon we tell that
		numbers.stream().map(num-> num*3).forEach(System.out:: println);
	}

}
