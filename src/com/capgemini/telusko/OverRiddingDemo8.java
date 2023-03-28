		package com.capgemini.telusko;
			// topic 8
			// in method over riding the child class method overrides the method of parent class
			// method overriding is an example of runtime polymorphism
		class A2{
			public void show() {
				System.out.println("in a");
			}
		}
		class B2 extends A2{
			@Override
			public void show() {/* here i have same show method  in both
		 	super and sub class so as i am creating object of class b then 
		 	show method of b is overriding the show method of class a some
		  	times to be more specific we use @override annotation to tell
		   	compiler to override the method
		    */
			 super.show();// if i want to call both show methods then i will use super keyword
			System.out.println("in B");
			}
		}
		public class OverRiddingDemo8 {
			public static void main(String[] args) {
			B2 obj = new B2();
			obj.show();
			}
		}
