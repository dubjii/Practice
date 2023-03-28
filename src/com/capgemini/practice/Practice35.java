package com.capgemini.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice35 {
	// all the question of devraj  
	public static void main(String[] args) {
		// finding no startin with a
		 List <String> al = Arrays.asList("akash","ankit","ram");
		  al.stream().filter(str-> str.startsWith("a")).forEach(System.out:: println);
		  // finding even numbers
		  List<Integer> al1 = Arrays.asList(1,2,3,4,5,6);
		  al1.stream().filter(n-> n%2 ==0).forEach(System.out:: println);
		  // finding no staring with 1
		  List<Integer> al2 = Arrays.asList(1,2,3,4,5,6,16,13,24,12);
		  al2.stream().map(n-> n+" ")/*coverting Integer into string*/.filter(n->n.startsWith("1")).forEach(System.out:: println);
		  // findind duplicate no
		  List<Integer> al3 = Arrays.asList(13,2,4,4,5,6,16,13,24,16);
		  Set<Integer> s = new HashSet<Integer>();
		  al3.stream().filter(n-> !s.add(n)).forEach(System.out:: println);
		  // finding first no present in list
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		  
		  //myList.stream().findFirst().forEach(System.out:: println);here i can not use forEach method for 
		  // findFirst so i have to write the ifPresent method 
		  myList.stream().findFirst().ifPresent(System.out:: println);//0p 10 ans
		  // finding total no of elements prsent
		 long result = myList.stream().count();
		 System.out.println(result);// op 9
		 // finding maximum value of element
		 Optional<Integer>  maxvalue = myList.stream().max((val1,val2)-> {return val1.compareTo(val2);});
		 System.out.println(maxvalue.get());
		 // sort the values prsent in stream
		 List<Integer> l = new ArrayList();
		 l = myList.stream().sorted().collect(Collectors.toList());
		 System.out.println(l);
		 // sort the list in decending order 
		 List<Integer> l2 = new ArrayList();
		 l2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println(l2);
		 // concat to list using stream
		 List<String> names1 = Arrays.asList("ram","mohan");
		 List<String> names2= Arrays.asList("rama","mohani");
		 Stream<String> s1 = names1.stream();
		 Stream<String> s2 = names2.stream();
		 List<String> names3 = new ArrayList();
		 names3 =Stream.concat(s1,s2).collect(Collectors.toList());
		 System.out.println(names3);
		 // finding strings whose length is geater than 5
		 names3.stream().filter(n-> n.length()>5).forEach(System.out:: println);
		// finding square of no in the list
		 al1.stream().map(i-> i*i).forEach(System.out:: println);
		 // printing the numbers using stream
		 
		 List<Integer> l3 = Stream.iterate(0, value-> value+1).limit(5).collect(Collectors.toList());
		 System.out.println(l3);
		 
		 
		}

	}


