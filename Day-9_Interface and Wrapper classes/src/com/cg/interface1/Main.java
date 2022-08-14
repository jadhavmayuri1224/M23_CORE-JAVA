package com.cg.interface1;
class Main implements Example1
{
	public void display()
	{
		System.out.println("Hey guys,How are you!");
	}
	public static void main(String args[])
	{
		Main m=new Main();
		m.display();
	}
}
