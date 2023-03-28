package com.capgemini.java8;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,6,8);
		List<Integer> al1 = Arrays.asList(1,3,4,8);
		for(int i:al) {
			for(int j:al1) {
				if(i==j) {
					System.out.println(i);
				}
			}
		}

	}

}
