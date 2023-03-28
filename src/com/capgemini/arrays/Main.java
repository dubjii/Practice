package com.capgemini.arrays;

public class Main {

	public static void main(String[] args) {
		int arr[]= {6, 3, 1, 7, 4};

		total(arr);

		}

		public static void total(int[] arr)
		{


		int sum = 0;
		
		
		for (int i = 0; i < arr.length; i++)



		sum+=arr[i];



		System.out.println("sum  : " +sum);

	}

}
