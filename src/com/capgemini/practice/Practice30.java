package com.capgemini.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Practice30 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("ved", 12000, 21));
		al.add(new Employee("akash", 1200, 25));
		al.add(new Employee("sayali", 1300, 22));
		// i want to do the sorting on the basis of name 
		Collections.sort(al);
		System.out.println(al);
	}

}
