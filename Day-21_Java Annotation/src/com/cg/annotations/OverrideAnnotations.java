package com.cg.annotations;
//@Override annotations is giving the extra information about the method
class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is : "+s+"km/hr");
	}
}
class BMW extends Car
{
	@Override
	public void speed(int str) {
		System.out.println("Speed is : "+str+"km/hr" );
	}
}

public class OverrideAnnotations {
	public static void main(String args[])
	{
		BMW b=new BMW();
		b.speed(69);
	}

}
