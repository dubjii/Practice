package com.capgemini;

public final class LambdaExpressionDemo {// it is feature of java 8
	//lambda is anonymous function having no name no modifier no return type
		// lambda is only used with functional interface
	// if only one statement no need of curly braces
	// no need to enter type of arguments
	/* example of lambda public void m1(){
	 	System.out.println("test");
	  }
	  equivalent to ()-> System.out.println("test");
	  public int getLength(String str){
	  return str.length();
	  } this in lambda is (str) -> str.length();
	  no need to give type of data*/
	// functional interface contains only one abstract method ex runnable , comparable etc.
	// we need f.i for lambda expression
	public static void main(String[] args) {
			// lambda do not have name no modifier no return type
			//and type of arguments can also be removed
		
			/*converting a method into lambda expression 
			 * public void myName(){
			 * Sysout("jhon");
			 * }
			 *public void  (){
			 * sysout("jhon");
			 * }
			 *  void  (){
			 * sysout("jhon");
			 * }
			 *  (){
			 * sysout("jhon");
			 * }
			 *   ()->{
			 * sysout("jhon");
			 * }
			 *   ()->sysout("jhon");lambda expression
			 *   
			 *   //second 
			 *   public void add(int a,int b){
			 *   syout(a+b);
			 *   }
			 *(a b)->syout(a+b);
			 *   
			 *   //3rd 
			 *   public int length(String s){
			 *   return s.length();
			 *   }
			 * 	(s)-> s.length();
			 * 
			 * */
			
	}

}
