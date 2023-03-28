package com.capgemini.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String name;
	int salary;
	
public Employee(int empid , String name, int salary) {
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	
}
	
}
public class StreamApiDemo11 {

	public static void main(String[] args) {
		// Here we will use filter and map combined 
		//first filter the data then apply the map followed by collect
		// sequence 
		// collection ---> stream--> filter --> map ---> collect
//		List<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.add(new Employee(101,"alex",10000));
		// or i can do it like this
		// i want employees having salary greater than 20000
		// this is Comparator i have written this to pass in sorted method 
//		Comparator<Employee> comparator = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if(o1.salary > o2.salary)
//					return -1;
//				else if(o1.salary < o2.salary)
//					return 1;
//				else return 0;
//			}
//		};
		List<Employee> employeeList = Arrays.asList(new Employee(101,"alex", 10000),
				new Employee(102, "bran", 20000),new Employee(103, "charles", 30000),
				new Employee(104 , "david", 40000),new Employee(105, "ed", 50000));
		List<Integer> obj = new ArrayList<>();
		// here p is an object passing object as a parameter
		// here using map just to store the salary of the object
			obj =employeeList.stream().filter(p -> p.salary>20000).map(p-> p.salary).collect(Collectors.toList());
				System.out.println(obj);		
				// here i wanted the employee having the max salary
		//Optional<Employee> maximum_value =employeeList.stream().sorted(comparator).findFirst();
		//System.out.println(maximum_value.get().empid+" "+maximum_value.get().name+" "+maximum_value.get().salary);
	}

}
