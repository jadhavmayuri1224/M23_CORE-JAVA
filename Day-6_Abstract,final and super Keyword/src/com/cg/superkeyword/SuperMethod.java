package com.cg.superkeyword;
class A{
	protected int Pin;
	public void display(int pin)
	{
		System.out.println("Pin is"+pin);
	}
}
class B extends A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is"+pin);
	}
	public void print()
	{
		display(3245);//child class method
		super.display(5636);//parent class method
		
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();
				

	}

}
