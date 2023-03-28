package com.capgemini.practice;
	

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public class Practice36 {

	public static void main(String[] args) {
	
		
		List<Integer> al = Arrays.asList(5,8,1,5,4,3);
	
		Collections.sort(al);
		
		System.out.println(al);
		System.out.println("in reverse order");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		System.out.println("using stream");
		al.stream().sorted().forEach(System.out:: println);
		System.out.println("using stream in resverse");
		
		al.stream().sorted(Comparator.reverseOrder()).forEach(System.out:: println);
		Optional<Integer> result = al.stream().max((x,y)-> x.compareTo(y));
		System.out.println(al.stream().reduce(0,(a,b)->a+b));
		System.out.println(al.stream().mapToDouble(a->a).sum());
		System.out.println(result.get());
	}

}
