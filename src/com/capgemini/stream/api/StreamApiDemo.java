package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	// java.io.stream used for binary operation like reading data from file and all
	// these streams are part of java.util package
	// most important features of java 8 were lambda expression and StreamApi
	// important features of java 8
	//default and static methods in Interfaces.Functional Interfaces and Lambda Expressions.
	//Java Stream API for Bulk Data Operations on Collections.
	//these streams are related to collection frameworks /groups of object .
	//these streams are very different from io stream , (io streams are the sequence of data) with help of
	// io stream we read and write data from source to destination
	//Introduced in java 1.8
	// stream have two different mechanism by which they can process the object of collection(data)
	// s.api is basically perform bulk operation and process the object of collection
	// it reduced code length
	// filter mechanism me hum data ko kisi condition ke basis pe filter karenge data ko aur 
	//us data ko kisi collection me rakh denge ya koi aur pupose ke liye use karenge
	// like finding just even no  from a collection
	// map me hum har ek element pe kuch operation karenge aur then us data ko kisi collection me store karenge
	// ya use kisi aur purpose ke liye us karenge this is map or mapping
	// example adding 5 to every element 
	// in case of filter the data may be reduced 
	// by stream we do not directly process the data from collection we will add data to stream then
	// we do the remaining process 
	// there is a class Stream 
	// create a list and filter all even no from list (question) 
	// we r going to solve above question using stream api and without api  
	
	public static void main(String[] args) {
		// one way to create list 
		//List<Integer> list1 =	List.of(2,4,50,21,22,67);
		//created a list it is immutable list of integer list 
		// so we can not perform other operations here like add and all
			List<Integer> l = new ArrayList<>();// old way to create list
			l.add(2);
			l.add(4);
			l.add(50);
			l.add(21);
			l.add(22);
			l.add(67);
		//	List<Integer> list1 = Arrays.asList(23,45,66,78,56,45);
			// one more way to create a list this is also immutable 
			List<Integer> listeven = new ArrayList<>();
			// without stream 
			for(Integer i : l) {// for each loop
				if(i%2 == 0) {
					listeven.add(i);
				}
			}
			System.out.println(l);
			System.out.println(listeven);
			// with streamApi
			Stream<Integer> stream = 	l.stream();
			// Here Stream is an Interface in java.util.stream package 
			//stream is an object 
			// creating stream  of list l(stream(); this is a method)
			// yha list l se stream nikal ke use stream nam ke variable me rakh diya hai
			// ab hum stream pe operation perform kar sakte hai
			// we have sorted and count collect distinct forEach  min max  method of Stream class 
			// study about predicate and consumer
			 List<Integer> newList =stream.filter(i-> i%2 == 0).collect(Collectors.toList());
			 // with help of filter i filtered using lambda to the test method of predicate functional 
			 // interface then collect in in collectors 
			 //toList() it is a method having return type as a list
			 System.out.println(newList);
			 // now i want to print no which are greater than 50 
			 //without stream api 
			 List l2 = new ArrayList();
			 for(int i : l) {
				 if(i>50){
				l2.add(i);	 
				 }
			 }
			 System.out.println(l2);
			// with stream api
			List <Integer> l3 = new ArrayList<>();
			Stream<Integer> obj = l.stream();
			l3 =obj.filter(i-> i>50).collect(Collectors.toList());
			System.out.println("with stream");
			System.out.println(l3);
	}
			

}
