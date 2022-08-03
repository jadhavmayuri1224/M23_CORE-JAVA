package com.capgimini.introduction;

import java.util.Scanner;

public class DoubleInput {

	public static void main(String[] args) {
		//compile time input
		//char x='a';
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value of x");
			//runtime input
			double x=s.nextDouble();
		System.out.println("The character is : "+x);


	}

}
