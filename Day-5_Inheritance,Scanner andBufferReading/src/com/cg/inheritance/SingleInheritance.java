package com.cg.inheritance;
class Parent
{
	protected int  rollno;
	void print() 
	{
		System.out.println("Hey  guys!Whats going on?");
	}
}
	class Child extends Parent
	{
		void accept() {
			System.out.println("rolno is "+rollno);
		}
	}
public  class SingleInheritance {

	public static void main(String[] args){
		Child c=new Child();
		c.rollno=112;
		c.accept();
		c.print();

	}

}
