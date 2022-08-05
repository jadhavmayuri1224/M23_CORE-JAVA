package com.cg.inheritance;
class Bike{
	protected int speed;
	void display()
	{
		System.out.println("I love to drive a bike");
	}
}
class Pulsar extends Bike
{
	protected String color;
	void accept()
	{
		System.out.println("Speed is :"+speed);
	}
}
class Pulsar125 extends Pulsar
{
	void print()
	{
		System.out.println("color is :"+color);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Pulsar125 p= new Pulsar125();
		p.color="Blue";
		p.speed=67;
		p.accept();
		p.display();
		p.print();
		

	}

}
