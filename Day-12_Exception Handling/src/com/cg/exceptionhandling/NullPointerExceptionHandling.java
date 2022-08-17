package com.cg.exceptionhandling;

public class NullPointerExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		String str=null;
		try
		{
			str.equals("JAVA");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(str.equals("Java"));
		}

	}

}
