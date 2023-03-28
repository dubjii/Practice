package com.capgemini.kk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lect2 {
	
	int id;
	void print() {
		System.out.println(id);
	}

	public static void main(String[] args) {
//		Lect2 l = new Lect2();
//		l.print();
//		int val =1;
//		System.out.println(val);
		//List<Integer> al = Arrays.asList(13,6,7,12,1,4);
		//al.stream().map(x-> x+" ").filter(n-> n.startsWith("1")).forEach(System.out::println);
		List<String> al = Arrays.asList("akash dubey is myb name");
		 long result = al.stream().filter(x-> !(x == "a"|| x== "e"|| x== "i" || x== "o"|| x == "u")).count();
		 System.out.println(result);
	}

}
