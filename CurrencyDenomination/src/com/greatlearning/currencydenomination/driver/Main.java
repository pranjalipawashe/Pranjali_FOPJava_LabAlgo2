package com.greatlearning.currencydenomination.driver;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value ");
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		MergeSort sort = new MergeSort();
		sort.mergeSort(arr, 0, arr.length-1);
		/*
		System.out.println("Sorted Array is :");
        sort.display(arr);
        */
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
        // main logic
		int[] count= new int[arr.length];
		for(int i =0; i<arr.length; i++) {
			if(amount == arr[i]) {
				System.out.println(arr[i] +":1" );		
			}
			else
			{
				if(amount >=arr[i]) {
				   count[i] = amount / arr[i];
				   amount = amount - count[i]*arr[i] ;
				}
			}
		}
		
		if (amount > 0) {
			System.out.println("Amount cannot be paid with given denominations ");
			return;
		}
		System.out.println("Your payment approach in order to give min no of notes will be" );
		for(int i =0 ; i<arr.length ; i++)
		{
			if(count[i] != 0) {
				   System.out.println(arr[i] +":"+count[i] );
				}
		}
	
	}
}
