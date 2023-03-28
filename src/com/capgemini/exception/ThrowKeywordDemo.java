		package com.capgemini.exception;
			public class ThrowKeywordDemo {
			// throw keyword throw exception created by programmer to JVM
			// as main method was creating object of exception why program do that?
			//it is basically for customized exception or user defined exception
				public static void main(String[] args) {//syntax of throw 
			// throw new ExceptionclassName("");
					ThrowKeywordDemo t = new ThrowKeywordDemo();
					t.divide();
				}
			void divide() {// Handling exception in java divide method
				try {
			int a = 100, b = 0 ,c;
			c = a/b;
			System.out.println(c);
			}
			catch(Exception e) {
			System.out.println(e);
			}
		}
		}
		
	


