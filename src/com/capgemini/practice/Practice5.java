package com.capgemini.practice;
		
	class A{
		A(){
			System.out.println("hi i am in constructor of class A ");
		}
		A(int i){
			System.out.println("hi i am in parameterized constructor ");
		}
		public void add(int i ,int j) {
			System.out.println(i+j);
	}
	}
	class B extends A{
		
		B(){
			super(6);
			System.out.println("hi i am in constructor of class B");
		}
		
		
		public void sub(int i , int j) {
			System.out.println(i-j);
		}
	}
		
	public class Practice5 {

	public static void main(String[] args) {
	B obj = new B();
	obj.add(9, 34);
	obj.sub(7, 8);
	
	}

}
