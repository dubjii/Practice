package com.capgemini.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 {

	public static void main(String [] agrs) {
		HashMap<Integer , Integer> hm = new HashMap();
		hm.put(1, 35);
		hm.put(2, 37);
		hm.put(3, 30);
		hm.put(4, 31);
		hm.put(5, 32);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.keySet());
		for(Integer k: hm.keySet()) {
			System.out.println(k+ " " + hm.get(k));
		}
		for(int k:hm.values() ) {
			System.out.println(k);
		}
		Set<Entry<Integer, Integer>> s = new HashSet();
		s= hm.entrySet();
		for( Map.Entry k:hm.entrySet()) {
			System.out.println(k.getKey()+" " + k.getValue());
		}
		
	}
}
