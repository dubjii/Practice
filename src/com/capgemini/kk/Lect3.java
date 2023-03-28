package com.capgemini.kk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;





public class Lect3 {
	public static void main(String[] args) {
		
		HashMap<Integer ,String> hm = new HashMap<Integer,String>();
		hm.put(1,"akash");
		hm.put(2, "dipesh");
		hm.put(3,"ritesh");
		hm.put(4, "santosh");
		System.out.println(hm.get(3));
		System.out.println(hm.entrySet());
//		for(Object i: hm.keySet()) {
//			System.out.println(i);
//		}
//		for(Object i: hm.keySet()) {
//			System.out.println("the value for key " + i + " is "+ hm.get(i));
//		}
//		for(Map.Entry  entry : hm.entrySet()) {
//			System.out.println(" the entry are "+  entry.getKey() + "  " + entry.getValue());
//		}
		for( Object i:hm.keySet()) {
			System.out.println(i+ " " +hm.get(i) );
		}
		for(Object i: hm.values()) {
			System.out.println(i);
		}
		for(Map.Entry e : hm.entrySet()) {
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
	}

}
