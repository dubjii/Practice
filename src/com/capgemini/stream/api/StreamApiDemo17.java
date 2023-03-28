package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApiDemo17 {

	public static void main(String[] args) {
		// very important
		List<Integer> al = Arrays.asList(1,2,4,5,7,8);
		
		Integer [] a = {1,2,3,4,5,6,6,6};
	
	// here using of method of stream i have passed the array into the stream and then i can apply the method of
	// stream on array
	Stream.of(a)
	.distinct().forEach(System.out:: println);
	
	// reduce method this method will combine the objects into one single object 
	//or one single object into stream
	List<String> stringList = Arrays.asList("a","b","c","1","2","3");
	 Optional<String> reduced=stringList.stream().reduce((value, combinedvalue) -> 
	 {
	return combinedvalue+ value;
	}
	 );
	 System.out.println( reduced.get());//  op 321cba
	// finding the sum of list using reduce and sum methods
	 // return type of reduce is Integer
	  Integer result = al.stream().reduce(0,(x ,y)-> x+y);
	  System.out.println(result);
	  // another way to do sum is by doing the 
	Integer result1 =  al.stream().reduce(0,Integer :: sum);
		System.out.println(result1);
	}

}
