package com.cg.array;

public class Varargs 
{
	//Variable argument ...(elipse)=>
	static void print(int a,int b,String...s)
	
	{
	  System.out.println(a+","+b);
	  //to print varargs
	  for (int i=0;i<s.length;i++)
	  {
		  System.out.println(s[i]+"\t");
	  }
	}
	public static void main(String[]args)
	{
		//fun call
		print(13,65,"Python","Java","C++");
	}

}
