package com.cg.stream;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		List<String>obj1=Arrays.asList(new String[] {"Mayuri","Seema","Nia","Radhika"});
		//mapping example
		obj1.stream().map((i->i.length()>3)).forEach((i)->System.out.print(i+" "));


	}

}
