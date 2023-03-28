package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApiDemo21 {

	public static void main(String[] args) {
		// findAny() findFirst()
		// it returns an optional object
		List<String> stringList = Arrays.asList("one ","two","three","one");
		// if then is nothing in list and we are applying find any it will throw noSuchElementException
		 Optional<String> ele =stringList.stream().findAny();
		 System.out.println(ele.get());// it will print anything from list
		 // findFirst() this will print first element
		 Optional<String> ele1 =stringList.stream().findFirst();
		 // here it is returning an object of class optional we can not print object so i am using get method 
		 // to print the element
		 // it will also throw same exception if it is applied on empty list
		 System.out.println(ele1.get());
	}

}
