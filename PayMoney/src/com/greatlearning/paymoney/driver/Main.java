package com.greatlearning.paymoney.driver;

import java.util.Scanner;

public class Main {
	public static void checkTarget(int target, int[] arr, int size)
	{
		int checkVar = 0;
	    int idx = 1;
	    boolean chkCondtn = false;
	
	    for( int i =0; i < size ; i++)
	    { 
		    checkVar += arr[i];
		
    		if(checkVar >= target)
	    	{
		    	chkCondtn = true;
			    System.out.println("Target achieved after " + idx + " transactions" );
			    break;
		    }
	    	idx+= 1;
	    }
    	if(chkCondtn == false)
	    {
	        System.out.println("Given target is not achieved");
	    }
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		System.out.println("Enter the values of array");
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets to be achieved ");
		int targets = sc.nextInt();
		
		
		int[] target = new int[targets];
		for(int i=0; i<targets; i++)
		{
			System.out.println("\nEnter the value of target " );
			target[i] = sc.nextInt();
			checkTarget(target[i],arr ,size);
		}
				
	}
}
