package com.tns.collection;

import java.util.ArrayDeque;

public class QueueExample2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayDeque a=new ArrayDeque();
		a.add(11);
		a.add("hello");
		System.out.println(a);
		a.addFirst(12);
		a.addFirst("{world");
		System.out.println(a);

	}

}
