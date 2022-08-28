package com.cg.annotations;
class A
{
	//IT ALLOWS ANY ELEMENTS NO LONGER TO BE USED
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to Mumbai");
	}
}
public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}
