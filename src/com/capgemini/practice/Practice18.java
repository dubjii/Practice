package com.capgemini.practice;
		class A12{
			void add(int ...n) {
				int sum = 0;
				for(int i :n) {
					sum = sum+i;
				
				}
				System.out.println("the value of sum is..." + sum );
				
			}
		}
public class Practice18 {

	public static void main(String[] args) {
		A12 obj = new A12();
		obj.add(1,2,4,5,5,6);
	}

}
