package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("and");
		//Matcher m=p.matcher("Java is good language to learn and earn the money and I like it to learn");
		//using user-input
		System.out.println("Enter the String :");
		Matcher m=p.matcher(s.nextLine());
		//it will check "and location until last and it will print
		while(m.find())
		{
			System.out.println("Pattern from "+m.start()+" to "+(m.end()-1));
		}
		s.close();

	}

}
