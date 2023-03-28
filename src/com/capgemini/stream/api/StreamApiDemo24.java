package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo24 {

	public static void main(String[] args) {
		// finding no of  occurence of elements in list 
		List<Integer> al = Arrays.asList(1,2,3,3,3,3,4,4,4,1);
	 	 System.out.println(al.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())));
	 	 // find the no of oocurence of character in element
	 	 String st = "raaj";
	 	 // chars convert into int stream asci value me convert kar deta hai
	 	 
	 	 System.out.println(st.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(i->i,Collectors.counting())));
	 	  

	}

}
