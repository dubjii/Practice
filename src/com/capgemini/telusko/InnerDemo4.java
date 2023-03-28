		package com.capgemini.telusko;
		// topic 4
		//a class can have have variable a method and a class 
		// we can create a class inside a class 
		// we should chose comparable and when we can use comparator
		// if i have a class and i can do some modifications to it then i will use Comparable 
		// if i can not do modifications then i will use comparator interface
		class Outer{ // this is outer class
			int a;
			public void show() {
				System.out.println("hi");
			}
			class Inner{// it is a class inside a class it is know as inner class.
				 // the name of inner class will be like Outer$Inner.class
				public void display() {
					System.out.println("In display");
				}
			}
			//static class Inner{// static inner class 
				//public void display() {
					//System.out.println("In display");
				//}
			//}
		}
		public class InnerDemo4 {
			public static void main(String args[]) {
				Outer obj = new Outer();
				obj.show();
				// Inner obj2 = new Inner(); this is not how we can declare inner object
				Outer.Inner obj1= obj.new Inner();// declaring a inner class object.
				// creating object of static inner class 
				//Outer.Inner obj1 = new Outer.Inner();
				obj1.display();
			}
		}
