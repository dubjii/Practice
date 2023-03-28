package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo2 {

	public static void main(String[] args) {
	// Stream api is used to process group of objects means it can 
		// be used collection plus arrays also
		// getting object of stream 
		// to create blank stream 
		Stream <Object> emptyStream = Stream.empty();
		// here i have created an stream object but it have no data 
		// 2nd way using array
		String [] names = {"akash","Durgesh", "divya","ankit"};
		// here i want to filter all the names starting with d how i will do that
		Stream<String> stream1 = Stream.of(names);
		//stream1.filter(str->str.startsWith("d")).forEach(System.out:: println);// here i got the stream of the name 
		// to print the names from stream using for each method it will just print the list
		stream1.forEach(e-> System.out.println(e));// here for each method takes
		// consumer interface and this interface is having accept method so provided implementation 
		// of accept method using lambda function
		// 3rd way
		Stream<Object> streamBuilder = Stream.builder().build();
		//4th
		IntStream stream2 =  Arrays.stream(new int[] {2,4,76,8});
		// 5th most important way
		// the way used in the StreamApiDemo to create a stream
		// there are more ways to create stream also
		
	}

}
