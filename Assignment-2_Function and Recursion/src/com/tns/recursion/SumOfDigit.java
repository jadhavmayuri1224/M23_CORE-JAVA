package com.tns.recursion;

import java.util.Scanner;

public class SumOfDigit 
{
	 static int n;
	int sum=0;
	int add(int n)
    {
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + add(n / 10);
        }
	
    }
	 public static void main(String[] args) 
	    {
	        
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        n = s.nextInt();
	        SumOfDigit obj = new  SumOfDigit();
	        int a = obj.add(n);
	        System.out.println("Sum:"+a);
	        s.close();
	    }
}


	