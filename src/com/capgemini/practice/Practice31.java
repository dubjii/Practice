package com.capgemini.practice;

import java.util.ArrayList;
import java.util.Collections;

class Child implements Comparable<Child>{
	private String name;
	private int id;
	private int rollno;
	
	
	
	public Child(String name, int id, int rollno) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rollno=" + rollno + "]";
	}
	
	@Override
	public int compareTo(Child o) {
		// TODO Auto-generated method stub
		//return this.getId()-o.getId();
		//return this.getRollno()-o.getRollno();
		return this.getName().compareTo(o.getName());
//		if(this.getId()<o.getId()) {
//			return -1;
//		}
//		if(this.getId()>o.getId()) {
//			return +1;
//		}
//		return 0;
	}
	
}
public class Practice31 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Child("akash", 1, 10));
		al.add(new Child("shyam", 2, 12));
		al.add(new Child("manish", 0, 9));
		System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);
		Collections.sort(al, new IdComaprator());
		System.out.println(al);
	}
}
