			package com.capgemini.exception;
			// how jvm handles exception default exception handling whenever inside a method if an exception 
			//occured the method creates an object known as exception object and hands it of to the run time
			// System(jvm) the exception object contains name and decreption of the exception and current 
			//state of program where exception has occured  creating the exception object and handellinng to 
			// the run time system is called throwing the exception there might be the list of methods that
			// had been called to get to the method where exception has occured .this ordered list of methods
		    //	is called call stack now the following procedure will happen
			// the run time system searches the call stack to find the method that contaians block of code 
			// that can handle the occured exception the block of code is called exception handler 
			// we can  not stop execution of finally block by return of a method
			//int m1(){
//			try {
//				int a = 5/5;
//				return 1;
//			}
//			catch(Exception e) {
//				return 2;
//				
//			}
//			finally {
//				return 3;
//			}
			//it will return 2 as finally block
			// nullPointerException this exception is raised when reffering the members of a null object Null 
			// Represents nothing
			// after try we need catch but if we are not using catch then we have to use the finally block
			
				public class ExceptionDemo2 {
					public static void main(String[] args) {
						try {
							
							int a[] = new int[6];
						a[6]= 8;// it is not there so arrayindexout of bound exception
						// after exception occurs no line after that gets executed in try block
						// so do not write any code after the critical code
						}
		catch(ArithmeticException e) {
								System.out.println("bye");
			}
		catch(ArrayIndexOutOfBoundsException e) {// we can use multiple catch block after try
			System.out.println("array size exception");
		}
		catch(Exception e) {// this can handle every exception thats why it used at last
			System.out.println("hi");
		}
// output of this program is array size exception as it is throwing arrayindex out of bound one
	}

}
