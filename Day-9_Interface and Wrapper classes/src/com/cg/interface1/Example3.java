package com.cg.interface1;

interface Example3 {
	void myMethod();
}
interface Example31 {
	void myOtherMethod();
}
class Mayuri implements Example3 {
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}
class Main123
	{
	public static void main(String[] args) {
		Mayuri myObj = new Mayuri();
		myObj.myMethod();
		myObj.myOtherMethod();
		
	}
}
