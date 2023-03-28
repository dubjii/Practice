		package com.capgemini.telusko;
		// topic 16
		class A6{
			public void show() {
				System.out.println("i A6 show");
			}
		}
		public class AnonymousDemo16 {
			public static void main(String[] args) {
			A6 obj = new A6() 
			{
				public void show()
				{
					System.out.println("i am the best");//it is a class which do not have a 
					//name so it known as anonymous class we can not reuse it. 
					// create an object and just before  semicolon provide implementation 
				}
			};
				obj.show();
			}
		}  