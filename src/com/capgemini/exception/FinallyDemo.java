		package com.capgemini.exception;
			public class FinallyDemo {// finally block always occurs exception occur or not
				// we can use try catch finally or try finally but in try finally the exception is not handled
				// we can not use finally block separately
				public static void main(String[] args) {
			try {
				int a = 100,  b = 0, c;
				c = a/b;
				System.out.println("c");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				// very important point Yes, the finally block will be executed even after a return statement in a method
				// the program terminates abnormally but after finally block 
				// if we have not used the catch block
				// in catch block we write handling code
				// in finally block we write clean up code
				// we can use try catch block in finally block also
				// we can use multiple catch block with one try but only one finally 
				/* final keyword finally is block finalize is a method
				 syntax of finalize  method is protected void finalize () throws Throwable{
				 } 
				 Possible combination of try catch finally
				 1 only try wrong
				 only catch wrong 
				 only finally wrong
				 we can use try catch block in try block  but followed by catch block
				 try{
				 try{
				 }
				 catch{
				 }
				 }
				 catch{
				 }  we can use try catch in catch block*/
				//System.exit(0);
				System.out.println("i am in finally block");
			}
	}

}
