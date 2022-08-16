package com.tns.strings;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("lets play cricket");
	System.out.println(st.nextToken());
	System.out.println(st.nextToken());
	System.out.println(st.nextToken());

	}

}
