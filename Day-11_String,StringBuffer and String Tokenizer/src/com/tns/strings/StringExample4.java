package com.tns.strings;

import java.util.Scanner;

public class StringExample4 {

	public static void main(String[] args) 
	{
		String str="Mahi";
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		if(str1.equals(str))
		{
			System.out.println("Matching");
			
		}
		else
		{
			System.out.println("Not Matching");
		}
		

	}

}
