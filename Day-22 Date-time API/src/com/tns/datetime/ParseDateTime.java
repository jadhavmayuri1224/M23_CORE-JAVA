package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseDateTime {

	public static void main(String[] args) {
		String datetime="2022-08-28 18:17";
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime,df);
		System.out.println(l);
		
	}

}
