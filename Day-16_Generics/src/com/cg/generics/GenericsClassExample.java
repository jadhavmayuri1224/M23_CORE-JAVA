package com.cg.generics;

public class GenericsClassExample<T> 
{
	T num;
	//method
	public void show()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		// instead of collectioni have used geb=neric class name and genericconcept
		GenericsClassExample<Double>obj=new GenericsClassExample<>();
		obj.num=13.8;
		obj.show();

	}

}
