package com.cg.Lamdaexpr;
//functional interface=> exactly one abstract method
interface A
{
	void print();//abstract method
}
//length of code is increased using Implementation class B
class B implements A
{
	@Override
	public void print()
	{
		System.out.println("Functional interface implementation without " +"Lambda Expression");
	}
}

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
	  B b=new B();
	  b.print();
	  //1.lambda expr implements the functional interface
	  //2.length of the code is decreased using lambda expression
	  A obj=()->
	  {
		System.out.println("Functional interface implementation without " +"Lambda Expression");
	  };
	  obj.print();

	}

}
