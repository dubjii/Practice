package com.capgemini;

public class ArithmaticOperator {

	public static void main(String[] args) {
		int i = 5;
		System.out.println(++i);// first increase value then prints output 6
		System.out.println(i);//6
		System.out.println(i++);// prints then operation 6
		System.out.println(i);//7
		System.out.println(--i);//6
		System.out.println(i);//6
		System.out.println(i--);//6
		System.out.println(i);//5
		i += 5;// i= i+5;
		System.out.println(i);//10
		i -=5 ; // i = i-5;
		System.out.println(i);
		i *=5;
		System.out.println(i);
	}

}
