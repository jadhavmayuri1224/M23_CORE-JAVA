package com.tns.recursion;

import java.util.Scanner;

public class SumOfDigit {
  int sum=0;
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		n=s.nextInt();
		SumOfDigit sod=new SumOfDigit();
		int a=sod.add(n);
		System.out.println("Sum:"+a);
		
	}
	int add(int n)
	{
		sum=n%10;
		if(n==0)
		{
			return 0;
		}
		else
		{
			return sum+add(n/10);
		}
	}

}
