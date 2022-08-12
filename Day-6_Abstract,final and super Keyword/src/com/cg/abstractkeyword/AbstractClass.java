package com.cg.abstractkeyword;
abstract class Flower{
	abstract void print();
	void accept()
	{
		System.out.println("hey guys ,I like it");
	}
}
class Rose extends Flower
{
	void print()
	{
		System.out.println("its a child");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Rose r=new Rose();
		r.accept();
		r.print();
		

	}

}
