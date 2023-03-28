		package com.capgemini.exception;
		//The Exception class is a subclass of the Throwable class.eror also extends Throwable
		// error we always get at run time
		// exception are events that occur during execution of program that disrupt the 
		// normal flow of instructions in java 
		// Exception class is parent class of all runtime exception
		// we can handle exception we can not handle error it causes termination of program 
		// example of error is outOfMemory error virtual machine error etc
		// example of compile time exception is ioException sqlException
		// example of runtime exception is AirthmethicException NullPointerException etc
		//When we get exception the execution of code stops there 
		//we handle exception using try catch block
		//error 3 types 
		//1  compile time :-> syntax error (mostly)
		//2 runtime :-> mostly bye user mistake 
		//3 logical:-> we get output but wrong output
		// runtime errors are known as exceptions in java
		// control shit f is used to format the program
		public abstract class ExceptionDemo {
				public static void main(String[] args) {
					try {
				//in try block where we get exception after that control goes to catch block
				/* critical statement*/int i = 9/0;
				// this line will exception at run time so will use try catch
				//the above line will throw object of exception so we have to catch it
				// the catch block will only invoke when there is a error
				// int a = 2;
				// int b = 1;
				// int k = a/b;
				// this line will not give error we will get value of k and bye as output
				// System.out.println(k);
				// very important point  object class is parent class of all classes in java
				//throwable is parent class of exception and error
				//compile time(checked exception) can checked by compiler 
				// run time (unchecked exception) compiler not able to check
				// exception always occurs at run time both
				
					}
					catch(ArithmeticException e) {// here we are catching object of error
				// catch block will get executed only when we have exception
						System.out.println("error");
					}
		
					finally {
						// it is a block which will get executed even if we get exception or not
						System.out.println("bye"); // it will always print bye.
					 /* there is difference between final and finally final is a
			        *  keyword use with class method and variables it makes 
			      *  variable constant can,t inherit class and can,t override method   */
					}
					
				}
			}
