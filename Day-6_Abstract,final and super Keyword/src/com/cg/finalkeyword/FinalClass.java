package com.cg.finalkeyword;
class Fruit
{
	Fruit()
	{
		System.out.println("Constructor");
	}
	//IF YOU MAKE ANY METHOD AS FINAL YOU CAN'T OVERRIDE IT
	//final public void accept()
	public void accept()
	{
		System.out.println("Parent class");
	}
}
class Apple extends Fruit
{
	public void accept()
	{
		System.out.println("Parent class");
	}
}


public class FinalClass {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.accept();
	

	}

}
