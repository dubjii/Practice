package com.capgemini.java8;

public class Demo11 {

	public static void main(String[] args) {
		String str = " i love india ";
		StringBuffer sb = new StringBuffer(str);
		//System.out.println(sb.reverse());
		String [] str1 = str.split(" ");
		for(int i = str1.length-1; i>=0; i--) {
			System.out.print(str1[i] + " ");
		}
	}

}
