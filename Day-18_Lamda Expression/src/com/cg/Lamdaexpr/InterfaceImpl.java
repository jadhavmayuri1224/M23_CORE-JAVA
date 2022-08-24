package com.cg.Lamdaexpr;
interface C
{
	void display();
	//void accept();
}

public class InterfaceImpl {

	public static void main(String[] args) {
		//The target type of this expression interface
		C obj=()->
		{
			System.out.println("Functional interface implementation using" +"Lambda Expression");
		};
		obj.display();

	}

}
