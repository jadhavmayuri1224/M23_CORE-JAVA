package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		//stream can be created with static data
		Stream<String>obj=Stream.of("Ravina","Mayuri","Manali","Nupur");
		obj.forEach((i)->System.out.print(i+" "));
		//stream can be acquired  from array or collection
		List<String>obj1=Arrays.asList(new String[] {"27","78","87","90"});
		obj=obj1.stream();
		obj.forEach(System.out::println);

	}

}
