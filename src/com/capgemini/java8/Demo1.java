package com.capgemini.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,3,4,5,5,5,2,1);
	 Map<Integer ,Long> hm =  (Map<Integer, Long>) l.stream().collect(Collectors.groupingBy(x-> x,Collectors.counting()));
	System.out.println(hm);
	// either use compare or compare to method both works fine 
	l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	int  res = l.stream().min(Integer::compare).get();
	int  res1 = l.stream().min(Integer::compare).get();

	System.out.println(res);

	}

}
