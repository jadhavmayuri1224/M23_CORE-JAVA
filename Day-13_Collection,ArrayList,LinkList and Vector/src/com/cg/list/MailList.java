package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class Address
{
	private int plotNo;
	private String Street;
	private String Area;
	private String City;
	private String State;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		Street = street;
		Area = area;
		City = city;
		this.State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, Area=%s, City=%s, State=%s]", plotNo, Street, Area, City,
				State);
	}
	
	
}

public class MailList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		//add elements to the LL
		obj.add(new Address(121,"Lane no2","Airoli","Navi Mumbai","Maharashtra"));
		obj.add(new Address(121,"Lane no2","Airoli","Navi Mumbai","Maharashtra"));
		@SuppressWarnings("rawtypes")
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
		}
		System.out.println();

	}

}
