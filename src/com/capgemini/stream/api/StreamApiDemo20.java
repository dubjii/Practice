package com.capgemini.stream.api;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamApiDemo20 {

	public static void main(String[] args) {
		// anyMatch() allMatch() noneMatch()
		Set<String> fruits = new HashSet<String>();
		fruits.add("one apple");
		fruits.add("one mango");
		fruits.add("two apple");
		fruits.add("more grapes");
		fruits.add("two guvava");
		boolean result =fruits.stream().anyMatch(value-> {return value.startsWith("one");});
		System.out.println(result);// true
		boolean result2 =fruits.stream().allMatch(value-> {return value.startsWith("one");});
		System.out.println(result2);// false
		boolean result3 =fruits.stream().noneMatch(value-> {return value.startsWith("one");});
		System.out.println(result3);// false
		Integer arr[]  = {10,20,30,50,60};
		 boolean result1 = Stream.of(arr).anyMatch(n-> {
			return n == 60;
		});
		 if(result1 == true) {
		 System.out.println("yes");
	}
		 else {
			 System.out.println("No");
		 }
		 
	}

}
