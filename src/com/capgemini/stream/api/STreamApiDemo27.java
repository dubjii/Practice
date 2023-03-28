package com.capgemini.stream.api;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class STreamApiDemo27 {

	public static void main(String[] args) {
		//Given a List of Integers find total count, min, max, sum, and the average for numbers by using Stream api
		//input  :list=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29] 
		//output: count=10, sum=129, min=2, average=12.900000, max=29

			List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
				IntSummaryStatistics status = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
				System.out.println(status);

	}

}
