package com.capgemini.string;
// topic update method of string
public class Demo2 {

	public static void main(String[] args) {
		String s1 = "this is demo";
		System.out.println(s1.replace("is", "was"));//thwas was demo
		// in replace we can not provide regular expression
		System.out.println(s1);
		System.out.println(s1.replaceFirst("is","was"));//thwas is demo
		System.out.println(s1.replaceAll("is", "was"));//thwas was demo
		// in replaceAll() we can provide regex ex
		System.out.println(s1.replaceAll("is(.)", "was"));//thwaswasdemo
		// it will remove spaces + replace
		//(.)is used to remove spaces
		//is(.) , (.*) this is known as regex
		System.out.println(s1.replaceAll("is(.*)", "was"));//thwas
		// remove everything and replace is with was 
	}

}
