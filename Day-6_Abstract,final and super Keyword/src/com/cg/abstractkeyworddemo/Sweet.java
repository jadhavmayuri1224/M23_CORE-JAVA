package com.cg.abstractkeyworddemo;
//abstract class
public class Sweet extends RasMalai
{
	public Sweet()
	{
		System.out.println("I like RasMalai");
	}
	//non abstract method
	public String taste() {
		return "Sweet";
	}
	//implementation of abstract method
	void print() {
		System.out.println("this is sweet");
	}

}
