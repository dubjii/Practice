package com.capgemini.stream.api;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
public class StreamApiDemo26 {

	public static void main(String[] args) {
//				Explain StringJoiner Class in Java 8? How can we achieve joining multiple Strings
//				using StringJoiner Class?
//				Answer: In Java 8, a new class was introduced in the package java.util which was known as
//				StringJoiner. Through this class, we can join multiple strings separated by delimiters along
//				with providing prefix and suffix to them.
//				In the below program, we will learn about joining multiple Strings using StringJoiner Class.
//				Here, we have “,” as the delimiter between two different strings. Then we have joined five
//				different strings by adding them with the help of the add() method. Finally, printed the
//				String Joiner.

				
				 StringJoiner stj = new StringJoiner(",");
				 // Separated the elements with a comma in between.

				 stj.add("Saket");
				 stj.add("John");
				 stj.add("Franklin");
				 stj.add("Ricky");
				 stj.add("Trevor");

				 // Added elements into StringJoiner “stj”

				 System.out.println(stj);	//output : Saket,John,Franklin,Ricky,Trevor
				// Write a Java Lambda Expression to Create Thread


				 Runnable withLambda = () -> System.out.println(" Runnable example with lambda exp.");
				     Thread thread1 = new Thread(withLambda);
				     thread1.start();
				    // Convert String to uppercase and Join them with coma

			 List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
			 String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
			 System.out.println(G7Countries);
				 }
				}

			

	
