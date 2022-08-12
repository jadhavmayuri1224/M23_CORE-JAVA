package com.cg.finalkeyword;
class A{
	A(){
		System.out.println("Constructor");
	}
	//IF YOU MAKE ANY METHOD AS FINAL YOU CAN'T OVERRIDE IT
	//final public void accept()
	public void accept()
	{
		System.out.println("Parent class");
	}
}
class B extends A{
	public void accept()
	{
		System.out.println("Parent class");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		B b=new B();
		b.accept();

	}

}
