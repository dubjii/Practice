package com.capgemini.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,4,6,7,8,9,4,6);
		al.stream().sorted().forEach(System.out:: println);
		System.out.println("reverse");
		al.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println("finding min");
		int res = al.stream().min(Integer::compareTo).get();
		System.out.println(res);
		System.out.println("findind max");
		int result1 = al.stream().max(Integer::compare).get();
		System.out.println(result1);
		System.out.println("finding frequency of no");
		Map<Integer, Long> mp = (Map<Integer,Long>)al.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(mp);
		
	}

}
