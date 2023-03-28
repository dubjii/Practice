package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiDemo30 {

	public static void main(String[] args) {
	List<Integer> al  = Arrays.asList(2,3,4,6,0,6,6,0);
	 int resu = Collections.frequency(al, 6);
	 Set<Integer> s = new  HashSet<>();
	 for(int k : al) {
		  boolean flag = (s.add(k));
	 if(flag == false) {
		 System.out.print(k);
	 }
	 }
	int result = al.stream().reduce(0,(a,b)-> a+b);
	System.out.println(result);
	Optional<Integer> res = al.stream().min((x,y)-> x.compareTo(y));
	System.out.println(res.get());
	}

}
