		package com.capgemini.telusko;
		// topic 5 
		class Cal {
			public int add(int... n) {// this is how we declare varargs(variable length arguments)
				int sum = 0;
				for (int i : n) {// here using for each loop
					// here in for each loop the value of n is coming to i one bye one and that is getting added
					sum = sum + i;
		}
		return sum;
			}
		}
		public class VarargsDemo5 {
			public static void main(String[] args) {
				Cal obj = new Cal();
				System.out.println(obj.add(4, 5, 6));
		// here i have give only 3 numbers but we can give as many as numbers we want to add
				 
			}
			}
