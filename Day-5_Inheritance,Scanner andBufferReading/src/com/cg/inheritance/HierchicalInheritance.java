package com.cg.inheritance;
class AndriodVersion
{
	void display() {
		System.out.println("Android-Version");
	}
}
class Kitkat extends AndriodVersion
{
	void print() {
		System.out.println("Kitkat");
	}
}
class Pie extends AndriodVersion
{
	void accept()
	{
		System.out.println("Pie");
	}
}
public class HierchicalInheritance {

	public static void main(String[] args) {
		Kitkat k=new Kitkat();
		Pie p=new Pie();
		k.display();
		k.print();
		p.accept();
	}

}
