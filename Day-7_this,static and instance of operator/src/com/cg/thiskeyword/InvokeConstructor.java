package com.cg.thiskeyword;
//this(): to invoke current class constructor
class Z
{
	public int x;
	//default constructor
	Z()
	{
		this(23);//invoking the parameterized constructor
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Z(int x)
	{
		System.out.println("Value is: "+x);
	
	}

}

public class InvokeConstructor {

	public static void main(String[] args) 
	{
		Z z= new Z();
		

	}

}
