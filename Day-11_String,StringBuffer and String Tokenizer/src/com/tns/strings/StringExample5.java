package com.tns.strings;

import java.util.Scanner;

public class StringExample5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		//System.out.println(str1.length());
		//System.out.println(str1.charAt(1));
		//System.out.println(str1.toUpperCase());
		//System.out.println(str1.toLowerCase());
		System.out.println(10+20+"hello"+"world"+10+20);
		System.out.println(str1.concat(str2));
		sc.close();

	}

}
