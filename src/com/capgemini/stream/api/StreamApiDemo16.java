package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApiDemo16 {

	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// my requirement is how many even numbers are there in this list
		// using count found that
		long result =	numberList.stream().filter(n-> n%2 == 0).count();
		System.out.println(result);
		// min () ,max() method terminal method 
		// min max method will take comparator
		// finding minimum and maximum elements 
		// min max will take comparator so we have to pass two arguments (val1,val2 in my case)
		// here we will pass two argument and using compareTo method they will find which one is lesser element
		// and that will be return the return type is Optional<Integer>
		Optional<Integer> minimum_value  =
				numberList.stream().min((val1 ,val2)-> { return val1.compareTo(val2);});
			// i can not directly get data i have to use get method of optional class
		System.out.println(minimum_value.get());// 1 op
		// max method 
		Optional<Integer> maximum_value  =
				numberList.stream().max((val1 ,val2)-> { return val1.compareTo(val2);});
		System.out.println(maximum_value.get());
		
	}

}
