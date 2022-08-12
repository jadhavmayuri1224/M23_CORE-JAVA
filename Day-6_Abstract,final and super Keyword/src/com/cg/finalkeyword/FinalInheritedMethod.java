package com.cg.finalkeyword;
class Car
{
	//final method is inherited but not be override;
	 String name;
	 final void print(String name)
	{
		System.out.println("My name is :"+ name);
	}
}
class Audi extends Car
{
	  
}

public class FinalInheritedMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");
		

	}

}
