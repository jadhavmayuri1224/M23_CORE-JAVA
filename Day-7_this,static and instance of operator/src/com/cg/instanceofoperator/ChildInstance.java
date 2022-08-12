package com.cg.instanceofoperator;
class A
{
	
}

public class ChildInstance extends A{

	public static void main(String[] args)
	{
		//c is the object of parent class"A" Because "ChildInstance class accessing the "A" class
		ChildInstance c=new ChildInstance();
		System.out.println(c instanceof A);
		System.out.println(c instanceof ChildInstance);
		
		
		

	}

}
