package com.capgemini.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class mp implements Comparable<mp>{
	int salary;
	int age;
	String satus;
	public mp(int salary,int age, String satus) {
		this.salary = salary;
		this.age = age;
		this.satus = satus;
		
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

	public String getSatus() {
		return satus;
	}

	public void setSatus(String satus) {
		this.satus = satus;
	}

	@Override
	public int compareTo(mp o) {
		
		return this.getAge()-o.getAge();
	}
	@Override
	public String toString() {
		return "mp [salary=" + salary + ", age=" + age + ", satus=" + satus + "]";
	}
	
}
public class Practice34 {

	public static void main(String[] args) {
		List <mp> l = Arrays.asList(new mp(39100, 34, "m"),new mp(38000,32,"um"),new mp(56763426,67,"m"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		

	}

}
