package com.cg.stream;

import java.util.HashSet;
import java.util.Set;

public class ColllectionLambda {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<>();
		obj.add(37);
		obj.add(75);
		obj.add(49);
		System.out.println(obj);
		/*if i want to extract this set value we can go ahead with Iterator,while loop
		for loop but using stream API-forEach() method we can do it in a one line
		*/
		//extracting the values from Set
		obj.forEach(System.out::println);

	}

}
