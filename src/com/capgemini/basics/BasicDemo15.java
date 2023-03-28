package com.capgemini.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	int salary;
	 String name;
	 
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
	if( this.getSalary()>o.getSalary()) {
		return -1;
	}
	if( this.getSalary()<o.getSalary()) {
		return 1;
	}
		return 0;
		
	}
	
}
public class BasicDemo15 {

	public static void main(String[] args) {
		
		List<Employee> l = Arrays.asList(new Employee(12, 100, "sayali"),
				new Employee(11, 150,"bhavan"),
				new Employee(16, 78, "narayan"));
		System.out.println(l);
		System.out.println("after the sorting");
			Collections.sort(l);
			System.out.println(l);
	}

}
