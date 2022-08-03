package com.capgimini.introduction;

import java.util.Scanner;

//program on the character
public class CharProgram {

	public static void main(String[] args) {
		//compile time input
	//char x='a';
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x");
		//runtime input
		char x=s.next().charAt(0);
	System.out.println("The character is : "+x);

	}
}