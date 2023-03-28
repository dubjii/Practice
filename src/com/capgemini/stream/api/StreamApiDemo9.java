package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiDemo9 {

	public static void main(String[] args) {
		// find the length of every  element and print that
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight", "train");
		List<Integer> nameLength = new ArrayList<Integer>();
		//without using stream
//		for(String name : vehicles) {
//			nameLength.add(name.length());
//		}
		// with using streams
//		System.out.println(nameLength);
		//vehicles.stream().map(name-> name.length()).forEach(n-> System.out.println(n));
		// or
		vehicles.stream().map(name-> name.length()).forEach(System.out:: println);
		
	}

}
