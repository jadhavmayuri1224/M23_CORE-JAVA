package com.tns.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Mayuri");
			break;
		case 2:
			System.out.println("Seema");
			break;
		case 3:
			System.out.println("Reena");
			break;
			default:
				System.out.println("Invalid input");
		}

	}

}
