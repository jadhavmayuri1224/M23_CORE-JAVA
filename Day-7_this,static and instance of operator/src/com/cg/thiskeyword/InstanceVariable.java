package com.cg.thiskeyword;
//this keyword use to refer the current class instance variable
class X
{
	public int m1,m2;
	public void print(int m1,int m2) 
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void display()
	{
	  System.out.println("Addition of m1 amd m2 is: "+(m1+m2));	
	}
}

public class InstanceVariable {

	public static void main(String[] args) 
	{
       X x=new X();
       x.print(88, 10);
       x.display();

	}

}
