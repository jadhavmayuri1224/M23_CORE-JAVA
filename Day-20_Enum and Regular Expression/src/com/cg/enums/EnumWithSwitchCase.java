package com.cg.enums;

import java.util.Scanner;

//Example on enum with switch case
enum Movie{
	//enum constant
	KGF2,BRAHMASTRA,PUSHPA,MAJOR;
}


public class EnumWithSwitchCase {
	//ENUM VAR
	Movie movie;
	//constructor for the "EnumWithSwitchCase"
	public EnumWithSwitchCase(Movie movie)
	{
		//as Enum var and constructor argument var is same -"use this keyword"
		this.movie=movie;
	}
	//using switch to display the actor name of the constants(movie)
	public void display()
	{
		switch(movie)
		{
		case KGF2:
		System.out.println("Yash and Shrinidhi Shetty");
		break;
		case BRAHMASTRA:
			System.out.println("Ranbie Kapoor and Alia Bhatt Kapoor");
			break;
		case PUSHPA:
			System.out.println("Allu Arjun and Rashmika");
			break;
		case MAJOR:
			System.out.println("Adivi Sesh and Saiee Manjrekar");
			break;
		
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie name that you want to display");
		String str=s.nextLine();
		//valueOf():- to get the constant whose value is passed as an argument while 
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();
	}

}
