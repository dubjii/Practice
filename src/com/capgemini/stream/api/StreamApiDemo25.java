package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo25 {

	public static void main(String[] args) {
		// questions of devraj
	// finding no of even no in list
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,18,17);
		//al.stream().filter(n-> n%2 ==0).forEach(System.out:: println);
		// finding the no starting with 1 in list
		al.stream().map(i-> i+" ")/*here i am converting integer into string*/
		.filter(i->i.startsWith("1")).forEach(System.out:: println);
		// find the duplicate element in a list
		List<Integer> al1 = Arrays.asList(1,2,2,4,5,17,18,17,1);
		Set<Integer> hs = new HashSet<Integer>();
		// find the first element present in list
		al1.stream().filter(i->!hs.add(i)).forEach(e-> System.out.println(e));
		System.out.println(al1.stream().findFirst().get());
		// find the total no of elements present in list
		System.out.println(al1.stream().count());
		// find the maximum value present in list
		System.out.println(al1.stream().max((x,y)-> x.compareTo(y)).get());
		// find the minimum value present in list
		System.out.println(al1.stream().min((x,y)-> x.compareTo(y)).get());
		// question 7 and 8 not done
		// sort the values present in list
		al1.stream().sorted().forEach(System.out:: println);
		// sort the values present in list in descending order
		al1.stream().sorted(Comparator.reverseOrder()).forEach(System.out:: println);
		// concat two streams
		List<String> names = Arrays.asList("ram","manthan","rahul");
		List<String> names1 = Arrays.asList("Ritesh","dipes","manish");
		List<String> names3 = Stream.concat(names.stream(), names1.stream()).collect(Collectors.toList());
		System.out.println(names3);
		 // Stream.concat(names.stream(), names1.stream()).forEach(System.out:: println);;
		// finding a sting length greater than 5
		names1.stream().filter(n-> n.length()>5).forEach(System.out:: println);
		// sorting the data on  the basis of string length
		
		names.stream().sorted((str1,str2)-> str1.length()-str2.length()).forEach(System.out:: println);
		//Explain StringJoiner Class in Java 8? How can we achieve joining multiple Strings
			//	using StringJoiner Class?
		
	}

}
