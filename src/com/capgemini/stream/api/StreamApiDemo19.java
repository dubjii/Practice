package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo19 {

	public static void main(String[] args) {
		//methods we are going to learn are sorted() anymatch() allmatch() nonematch() findany() findFirst()
		// concating streams 
		// sorted 
		// used to sort the list into asending and decending order
		
		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> list2 =list1.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);// op [1, 2, 3, 4, 5, 7, 9] accending order
		// if i want to sort in reverse order then 
		List<Integer> list3 =list1.stream().sorted((Comparator.reverseOrder())).collect(Collectors.toList());
			System.out.println(list3);// op [9, 7, 5, 4, 3, 2, 1]
			// for strings
			List<String> list4 =Arrays.asList("jhon","kin","david","smith");
			List<String> list5 =list4.stream().sorted().collect(Collectors.toList());
				System.out.println(list5);// sorted in accending natural order [Kin, david, jhon, smith]
			List<String> list6 =	list4.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			System.out.println(list6);// op is [smith, jhon, david, Kin]
			List<Integer> al1  = Arrays.asList(2,3,2,3,1,1);
			// this is a code to remove duplicate elements from list
			// here i am collecting the elements into set
			al1.stream().collect(Collectors.toSet()).forEach(System.out:: println);
	}

}
