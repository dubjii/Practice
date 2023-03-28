	package com.capgemini.telusko;
			// topic 9
		class A4{
			void show() {
				System.out.println("in a");
			}
		}
		class B4 extends A4{
			
			void show() {
				System.out.println("in b");
			}
		}
		class C4 extends A4{
			void show() {
				System.out.println("in c");
			}
		}
		public class DynamicMethodDispatchDemo9 {
			public static void main(String[] args) {
			// A4 obj /*this is jst reference */ = new A4();/* this is actual object*/
			A4 obj = new B4();//this thing is known as runtime Polymorphism ,known as Upcasting
				/*in the above line we have taken the reference of
			 	(super class) a and created object of b(sub class) this is known as runtime Polymorphism
			 	 here if we run it then we will get method show of
			 	 class b only as object is of b here using this technique
			 	 we can call only those methods which both classes have class A and B both */
				obj.show();// calling show method of class B4
				obj = new C4(); //  reference of a and created object of c
				obj.show(); // this is dmd// calling show method of class C4
			}
		}
