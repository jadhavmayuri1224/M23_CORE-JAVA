package com.cg.wrapper;

public class Example1 {
	
	public static void main(String args[])
	{
		int a=20;
		Integer i=0;
		@SuppressWarnings("removal")
		Integer j=new Integer(10);
		System.out.println(a+" "+i+" "+j);
	}
}