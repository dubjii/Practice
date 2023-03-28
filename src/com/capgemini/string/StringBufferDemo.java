package com.capgemini.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// created object of stringbuffer class 
		StringBuffer sb = new StringBuffer("deepak");
		//in string buffer there is no concat method here is append method to concat the string
		// string objcets are immutable while stringbuffer objects are  mutable
		
		System.out.println(sb.append(" java"));// deepak java
		//here append is used in string we used concat()
		System.out.println(sb.length());//11
		System.out.println(sb.charAt(5));//k
		System.out.println(sb.delete(0, 2));//epak java
		System.out.println(sb);//epak java
		System.out.println(sb.insert(2, "xxx"));//epxxxak java
		System.out.println(sb.reverse());//avaj kaxxxpe
		// string buffer class have equals method of object class
	}

}
