package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo18 {

	public static void main(String[] args) {
		// toArray() used to convert stream of object into array
		List<String> stringList = Arrays.asList("a","b","c","1","2","3");
		Object arr[] =stringList.stream().toArray();
		for(Object num : arr) {
				System.out.println(num);
		}
	}

}
