package com.cg.regexp;
//Demo  on matches() method of a pattern class

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMatchesMethod
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String pattern="MaYuRI@1020";
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);

	}

}
