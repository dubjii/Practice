package com.capgemini.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Person{
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
public class CollectionDemo23 {

	public static void main(String[] args) {
		// adding custom objects in map class 
		// hashmap will not maintain the insertion order
		// the linked hash map will maintain the insertion order
		// in treemap the key will be dive key in acceding order
		// in treemap we can store custom object as key because it is neither comparable nor comparator
		// if u want it to work then implement the comparable and comparator that will solve the prblm
		Map<Integer,Person>  hm = new HashMap();
		hm.put(1, new Person(22, "akash"));
		hm.put(2, new Person(23,"jagruti"));
		hm.put(3, new Person(24,"ved"));
		System.out.println(hm);
		// methods of TreeMap
		// 
		
		

	}

}
