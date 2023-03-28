		package com.capgemini.exception;
			import java.util.Scanner;
				class YoungerAgeException extends RuntimeException{// created  a runtime(unchecked exception)
					// we mostly created runtime exception
					/* constructor*/ YoungerAgeException( String msg) {
 							super(msg);// so that this msg is available for exception class
 							// in case of RunTimeException class we do not need to use try catch or throws
 							// for compilation so we can compile it even without that
 							// but for exception handling we have to use the try catch
 			}
 		}
				public class ThrowKeywordDemo2 {
					public static void main(String[] args) {
						Scanner sc = new Scanner(System.in);
						System.out.println("enter your age");
						int age = sc.nextInt();
						try {
							if (age<18) {
							throw new YoungerAgeException("you are not eligible to vote");
							// do not write any code after throw as it will get compile
							}	
				// with help of throw we r just creating exception object manually but 
			   //we have to handle exception  using try catch
		else {
			System.out.println("please vote");
		}
		}
		catch(YoungerAgeException e) {
			System.out.println(e);
		}
		System.out.println("hello");
	}


}
 		