package com.capgemini.string;
// topic searching method of string
public class Demo3 {

	public static void main(String[] args) {
		String s = "deepak";
		System.out.println(s.indexOf('e'));//1
		System.out.println(s.indexOf('a'));//4
		// it method takes char as input and prints first occurrence of that character
		// or -1 if character not present
		System.out.println(s.indexOf('h'));//-1
		System.out.println(s.lastIndexOf('e'));//2
		System.out.println(s.charAt(4));//a
		System.out.println(s.contains("ep"));//true
		System.out.println(s.contains("dp"));//false
		System.out.println(s.startsWith("d"));//true
		System.out.println(s.endsWith("s"));//false
	}

}
