	package com.capgemini.telusko;
		// topic 12 
			abstract class Human{ /* we can not create object of abstract class
		 	abstract keyword is used for making a class abstract
		 	abstraction is used for data hiding like we see gear not how it works*/
				public abstract void eat(); // it is method deceleration
			// we can not declare a method without abstract keyword
			// if we have abstract method we can just declare
			//it no need to define it. if we have abstract method then our class must be abstract 
			// we can extend abstract class but can not extend interface
				public void walk() {// abstract class having abstract + concrete method(defined)
			}
		}
		class Men extends Human{
			// if we extend abstract class then we have to( it is concrete class)
			//define the method other wise it will throw error
			// we do not need to touch walk method as it is already defined 
			public void eat() {
			}
		}
		public class AbstractDemo12 {
			public static void main(String[] args) {
			Human obj = new Men();
			// as i can not create object of Human because it is abstract class but
			//i can create object of men taking reference of human
			}
		}
