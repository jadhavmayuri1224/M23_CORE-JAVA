package com.tns.recursion;

import java.util.Scanner;

public class FibonacciSeries {

	static int fibo(int val)
	{
    		if (val==0)
        		return 0;
    		else if (val==1)
       	 		return 1;
    		else
        		return (fibo(val-1)+fibo(val-2));
	}

	public static void main(String args[])
	{
    		int n,i;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the nth term");
    		n=sc.nextInt();
		
    		System.out.println("Fibonacci series of first "+n+" terms is");
    		for(i=0;i<n;i++)
    		{
        		System.out.print(fibo(i)+" ");
    		}
	}
}