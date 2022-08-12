package com.cg.thisdemo;

public abstract class Base1
{
	//default constructor
	Base1()
	{
		this(54);
		System.out.println("Default constructor for base1:");
	}
	//parameterized constructor
	Base1(int i)
	{
		System.out.println("Parameterized constructor for base:"+i);
	}

}
