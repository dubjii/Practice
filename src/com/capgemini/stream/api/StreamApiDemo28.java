package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo28 {

	public static void main(String[] args) {
		StringJoiner st = new StringJoiner(",");
		st.add("manish");
		st.add("ruitesh");
		st.add("dipesh");
		st.add("santosh");
		System.out.println(st);
		Runnable r = ()-> System.out.println("here i am combining thread and lambda");
		Thread th = new Thread(r);
		th.start();
		List<String> names = Arrays.asList("manish","manthan","ram","dipu");
		 String names2= names.stream().map(n-> n.toUpperCase()).collect(Collectors.joining(","));
		 System.out.println(names2);
		 List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
		 IntSummaryStatistics obj = l2.stream().mapToInt(x-> x).summaryStatistics();
		 System.out.println(obj);
		 //study about iterate method
		// Stream.iterate(1, i-> i>10,i->i*2).forEach(System.out:: println);
		 
	}

}
