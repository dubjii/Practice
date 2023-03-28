		package com.capgemini.telusko;
		// topic 7 when we create object of sub class then by default it calls the constructor of 
		// super class this is done with the help of super() method
		// every constructor will have the by default super method
		// super keyword is a reference variable which is used to refer immediate parent class object
		class A1{
		A1(){
		System.out.println("In class A");	
		}
		A1(int i){
			System.out.println("in int a");
		}
		}
		class B1 extends A1{
			B1(){
			System.out.println("In class B");	
			}
			B1(int j){
				super();// it will call the constructor of super class
				/* it is by default there so if in will
				 call this constructor it will print i class a and in b int
				  as it is calling default of super class but if i want parameretisedone
				  of super class i can pass super(integer value) it will call that
				 */
				System.out.println("in b int");
			}
			}
		public class SuperDemo7 {

			public static void main(String[] args) {
			//A obj = new A(); when we create object of a it prints in a 
			B1 obj = new B1(5); /*but when we create object of b it will call 
			the constructor of class b as well as constructor of class a also
			as we have by default super method.so here it will print in class a in class b.
			*/
			}
			}
