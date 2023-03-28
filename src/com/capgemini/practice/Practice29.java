package com.capgemini.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Employee implements Comparable<Employee>{
	private String name;
	private int  salary;
	private int age;
	
	
	
	
	public Employee(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	public int compareTo(Employee o) {
		if(this.getAge()> o.getAge()) {
			return +1;
		}
			if(this.getAge()< o.getAge()) {
				return -1;
			}
		
		return 0;
		//	return this.empid-o.empid;
		// or i can write this code also there 
	}

	
	
}
public class Practice29 {

	public static void main(String[] args) {
		
		
	
	}

}
