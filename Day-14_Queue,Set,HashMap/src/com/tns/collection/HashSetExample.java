package com.tns.collection;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		//Set s=new HashSet();
		Set s1=new LinkedHashSet();
		s1.add(11);
		s1.add(null);
		System.out.println(s1);

	}

}
