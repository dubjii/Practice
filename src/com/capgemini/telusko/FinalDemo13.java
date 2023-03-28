		package com.capgemini.telusko;
		// topic 13
		final class A5{ // no other class can extend a final class.
			// string class is final class in java and wrapper class is also final class in java
			final int i = 6; 
			// once u make a variable final u can not change its value(it becomes constant)
			 //int i =8;// it will create error
			 public A5() {
				//i = 20; this line will give error here
				System.out.println(i);
			}
			 public final void show() {// no one can override final method
				 // no one can override static method also
			 }
			 public void show(int i) {// we can over load final method 
				// Can we overload a final main method?
					//	 Yes, overloading a final method is perfectly legitimate.
				 System.out.println("ji");
			 }
		}
		public class FinalDemo13 {
			// we can use final keyword at variables, methods,class
			public static void main(String[] args) {
				A5 obj = new A5();
			}
		}
