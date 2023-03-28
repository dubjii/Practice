		package com.capgemini.telusko;
			// topic 10
			// Encapsulation --> binding data with method 
		class Student {// object knows something with help of variables 
				//object does something with help of methods 
			private int rollno;/*
			 * the instance variables must be private and the method is public so here we are
			 *  binding data with method so this is known as encapsulation(making capsules) use 
			 *  for security reasons also binding data with methods is known as encapsulaton*/
			private String name;
			// using getters and setters
			public void setRollno(int r) { // setter method to set(give) the data
				rollno = r;
			}
			public int getRollno() {// getter method to get(take )data
				return rollno;
			}
			public void setName(String s) { // setter method to set(give) the data
				name = s;
			}
			public String getName() {// getter method to get(take )data
				return name;
			}
		}
		public class EncapsulationDemo10 {
			// using methods for getting and setting data encapsulation
			public static void main(String[] args) {
				Student obj = new Student();
				obj.setRollno(3);
				obj.setName("akash");
				System.out.println(obj.getName());
				System.out.println(obj.getRollno());
			}
		}
