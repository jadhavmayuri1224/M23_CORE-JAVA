package com.cg.exceptionhandling;

public class ThrowExample 
{

	
		static void display()
		{
			try
			{
				System.out.println("Inside display method");
				throw new RuntimeException("demo");
			}
			finally
			{
				System.out.println("Finally block is always executed");
			}
		}
		public static void main(String[] args)
		{
			try
			{
				display();
				
			}
			catch(Exception e)
			{
				System.out.println(";Exception" +e);
			}
		}

	

}
