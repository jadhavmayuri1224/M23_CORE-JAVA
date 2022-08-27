package com.cg.enums;
//to demostrate that Enum implements the interface
public enum Size implements PizzaSize
{
	SMALL,MEDIAM,LARGE,EXTRALARGE;
	@Override
	public void size()
	{
		System.out.println("Size is: "+this);
	}
}


