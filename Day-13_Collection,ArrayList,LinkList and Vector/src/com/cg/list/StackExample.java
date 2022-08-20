package com.cg.list;

import java.util.Stack;

public class StackExample {

	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		int O = 0;
		obj.add(O,"Shiwani");
		obj.add(O,'z');
		obj.add(O,12.5F);
		System.out.println(obj);
		//to insert
		obj.push(34);
		System.out.println(obj);
		//to remove the elements
		obj.pop();
		System.out.println(obj);

	}

}
