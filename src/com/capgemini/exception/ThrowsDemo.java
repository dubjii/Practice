		package com.capgemini.exception;
			// throws keyword is used with method
// this is used for compile time exception
// throws keyword indicates that if u use this method this might throw this type of exception 
		import java.io.*;  
		class M{  
			void method()throws IOException{  // here method throws ioexception 
				throw new IOException("device error");  
			}  
		}  
		public class ThrowsDemo {
			public static void main(String[] args) {
		  try{  
			     M m=new M();  
			     m.method();  
			    }
		  catch(Exception e)
		  {
			    	System.out.println("exception handled");
			    	}     
			  
			    System.out.println("normal flow...");  
			}
			}
 