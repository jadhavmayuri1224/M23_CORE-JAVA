package com.tns.recursion;

public class SumOfDigit {
	static int sum=0;
	public static void accept(int i)
	{
		if(i<=10)
		{
			sum=sum+i;
			accept(++i);
		}
	}

	public static void main(String[] args)
	{
		accept(1);
		System.out.println(sum);
		

	}

}
