package com.cg.scannBuff;

import java.util.Scanner;

public class ScannerClass
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		int a =sc.nextInt();
		System.out.println(a);
	}
}

