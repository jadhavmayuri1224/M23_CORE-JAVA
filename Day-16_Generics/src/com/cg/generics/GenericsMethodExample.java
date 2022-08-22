package com.cg.generics;

public class GenericsMethodExample 
{
	public static <E>void printArray(E[] elem)
	{
		for(E itr:elem)
		{
		    System.out.println(itr.getClass().getName());//to check the className	
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
	Integer[] arr1= {10,20,30};
	Character [] arr2= {'r','y','e'};
	System.out.println("Printing array for Integer");
	printArray(arr1);
	System.out.println("Printing array for character");
	printArray(arr2);

	}

}
