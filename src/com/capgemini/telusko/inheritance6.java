			package com.capgemini.telusko;
			// topic 6
/* 			there  is a two types of relationship in inheritance one 
 * 			is IS -A other is HAS-A when one class extends 
 * 			the other class that is know as is a relationship class b extends class A
 * 			if we have a class in which we are creating object of another
 * 		    class it is known as has a relationship for example here inheritance
 * 			demo has a object of class b*/
		    //in java we can have single level multilevel inheritance but not multiple inheritance
			//like class C extends A,B this is not allowed in java
			//In this Article, you will learn about the types o f Inheritance in Java.
			//Single-level inheritance.
//			Multi-level Inheritance.
//			Hierarchical Inheritance.
//			Multiple Inheritance.
//			Hybrid Inheritance.
		class A { // super class or parent class base class
			public int add(int i, int j) {
				return i + j;
			}
			}
		class B extends A // sub class or child class derived class
			//in this question we have done single level inheritance
		
		{
			public int sub(int i, int j) {
				return i - j;
			}
		}
		class C extends B{
			public int multi(int i, int j) {
				return i*j;
			}
		}
		public class inheritance6 {
			public static void main(String[] args) {
		C obj = new C();
		int result1 = obj.add(4, 5);
		int result2 = obj.sub(5, 4);
		int result3 = obj.multi(5, 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		// here in class A and B have a is a relationship like class B is extending class A
		// and class inheritance6 has a object of class C so has a relationship
			}
		}
