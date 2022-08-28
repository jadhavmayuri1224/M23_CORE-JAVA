package com.cg.annotations;
//Custom Annotation
@interface Custom
{
	//abstract method
	//single value annotation
	String print();
	int speed();
	float percentage();
}
class B
{
	@Custom(print="Hello Students",speed=50,percentage=88.3f)
	public void display()
	{
		System.out.println("Hurrah!It's Holiday");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	

	}

}
