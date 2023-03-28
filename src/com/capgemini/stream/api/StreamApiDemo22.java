package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo22 {

	public static void main(String[] args) {
		  List <String>list1 = Arrays.asList("dog","cat","lion");
		List<String> list2 = Arrays.asList("peacock","crow","parrot");
		/// now i will create 2 streams of two  list
		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 = list2.stream();
		// there is a static method of stream class to concat two streams
		 List<String> list3 = Stream.concat(stream1, stream2).collect(Collectors.toList());
		 System.out.println(list3); // op[dog, cat, lion, peacock, crow, parrot]
		 

	}

}
