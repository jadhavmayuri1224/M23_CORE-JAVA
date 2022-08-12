package com.cg.thiskeyword;
//this can be pass as a argument in the constructor call
class A
{
	public int num;
	A()
	{
		System.out.println("Welcome to M23 batch");
		
	}
	A(int num)
	{
		this.num=num;
	}
}

public class InstanceConstructor {

	public static void main(String[] args)
	{
		A a=new A();
		A b=new A(7);
		System.out.println(b.num);
	
	}

}
